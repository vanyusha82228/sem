package lesson1.impl;

import lesson1.Animal;
import lesson1.Runble;
import lesson1.Swimable;

public class dog extends Animal implements Runble, Swimable {
    public dog(String name, String color) {
        super(name, color, 4);
    }

    public dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("ауфф");
    }

    @Override
    public void hunt() {

    }

    @Override
    public int getRunSped() {
        return 15;
    }

    @Override
    public int getSwimSpeed() {
        return 5;
    }
}
