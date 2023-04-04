package lesson1.impl;

import lesson1.Workble;
import lesson2.Human;

public class Doctor extends Human implements Workble {
    public Doctor(String name) {
        super(name);
    }


    @Override
    public void getWork() {
        System.out.println("Doktor working at vetclinkik...");
    }
}
