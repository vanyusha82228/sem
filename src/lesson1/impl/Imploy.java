package lesson1.impl;

import lesson1.Workble;
import lesson2.Human;

public class Imploy extends Human implements Workble {
    public Imploy(String name) {
        super(name);
    }

    @Override
    public void getWork() {
        System.out.println("Сотрудник улиники");
    }
}
