package lesson2;

import lesson1.Animal;
import lesson1.Illable;

public class Human extends Animal implements Illable {

    public Human(String name){
        super(name);
    }

    @Override
    public void speak() {

    }

    @Override
    public void hunt() {

    }

    @Override
    public void getIll() {

    }
}
