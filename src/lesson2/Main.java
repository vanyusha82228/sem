package lesson2;

import lesson1.*;
import lesson1.impl.*;
import veterinary.vetClinic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        vetClinic vetClinic = new vetClinic();
        vetClinic
                .addAnimal(new Cat("мурзик"))
                .addAnimal(new dog("юобик"))
                .addAnimal(new Duck("дональд"))
                .addAnimal(new Eagle("Eeegle"))
                .addAnimal(new Doctor("Некит"))
                .addAnimal(new Imploy("Владик"));

        for (Animal a:
             vetClinic.getAnimals()) {
            System.out.println(a);
        }
        System.out.println("run");
        for (Runble r:
             vetClinic.getAllRunble()) {
            System.out.println(r+ "Его скорость равна"+ r.getRunSped());
        }
        System.out.println("swiim");
        for (Swimable s:
                vetClinic.getAllSwim()) {
            System.out.println(s+ "его скорость плаванья" + s.getSwimSpeed());
        }
        System.out.println("fly");
        for (Flyable f:
                vetClinic.getAllFly()) {
            System.out.println(f+ "его скорость полета" + f.getFlySpeed());
        }
        System.out.println("work");
        for (Workble w:
            vetClinic.getAllWork()) {
            System.out.println(w);

        };
//        List<Illable> illables = new ArrayList<>();
//        illables.add(new Cat("Barsik"));
//        illables.add(new Human("Василий"));
//
//        List<Flyable> flyables = new ArrayList<>();
//        flyables.add(new Eagle("eagle"));
//        flyables.add(new Duck("donald"));
//
//        for (Flyable f :
//             flyables) {
//            System.out.println(f.getFlySpeed());
//        }
//        int animalsCount = Animal.getAnimalsCount();
//        System.out.println(animalsCount);


    }
}
