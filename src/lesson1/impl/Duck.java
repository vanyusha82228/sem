package lesson1.impl;

import lesson1.Animal;
import lesson1.Flyable;
import lesson1.Swimable;

public class Duck extends Animal implements Flyable, Swimable {
    public Duck(String name, String color) {
        super(name, color, 2);
    }

    public Duck(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("кряя");
    }


    @Override
    public void hunt() {

    }

    @Override
    public int getFlySpeed() {
        return 10;
    }

    @Override
    public int getSwimSpeed() {
        return 10;
    }
}
