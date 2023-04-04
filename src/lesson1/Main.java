package lesson1;


import lesson1.impl.Cat;
import lesson1.impl.Duck;
import lesson1.impl.dog;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(null, null, 1) {
            @Override
            public void speak() {

            }

            @Override
            public void hunt() {

            }
        };
        //System.out.println(homwr1.animal.getColor());

        Animal animal1 = new Animal("прохор") {
            @Override
            public void speak() {

            }

            @Override
            public void hunt() {

            }
        };
//        System.out.println(animal1.getPawsCount());
//
//        System.out.println(animal1.getType());

        Cat cat1 = new Cat("проха");
//        System.out.println(animal1.getType());
//        System.out.println(cat1.getType());
//        cat1.speak();
//        animal1.speak();

        List<Animal> animals = new ArrayList<>();
        animals.add(cat1);
        animals.add(new dog("бобик"));
        animals.add(new Duck("Дональд"));

//        animals.forEach(lesson1.Animal::speak);

//        for (lesson1.Animal a: animals){
//            if(a instanceof lesson1.impl.Duck){
//                ((lesson1.impl.Duck) a).fly();
//            }
//            System.out.println(a);
//        }

        cat1.hunt();
    }
}