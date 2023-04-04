package lesson1.impl;

import lesson1.Animal;
import lesson1.Flyable;
import lesson1.Illable;

public class Eagle extends Animal implements Flyable, Illable {

    public Eagle(String name) {
        super(name);
    }

    @Override
    public void speak() {

    }

    @Override
    public void hunt() {

    }

    @Override
    public int getFlySpeed() {
        return 100;
    }

    @Override
    public void getIll() {

    }
}
