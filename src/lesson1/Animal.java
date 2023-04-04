package lesson1;

import java.sql.SQLOutput;

public abstract class Animal {
    public String name;
    private String color;
    private int pawsCount;

    private static int animalsCount = 0;

    public String getType(){
        return this.getClass().getSimpleName();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPawsCount() {
        return pawsCount;
    }

    public void setPawsCount(int pawsCount) {
        this.pawsCount = pawsCount;
    }

    public Animal(String name, String color, int pawsCount) {
        this.name = name;
        this.color = color;
        this.pawsCount = pawsCount;

    }

    public static int getAnimalsCount(){
        return animalsCount;
    }

    public Animal(String name) {
        this.name = name;
        animalsCount++;
    }

    public abstract void speak();

    public abstract void hunt();

    @Override
    public String toString() {
        return String.format("Имя: %s", this.name);
    }
}
