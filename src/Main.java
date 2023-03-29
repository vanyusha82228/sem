import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(null, null, 1);
        //System.out.println(animal.getColor());

        Animal animal1 = new Animal("прохор");
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

//        animals.forEach(Animal::speak);

//        for (Animal a: animals){
//            if(a instanceof Duck){
//                ((Duck) a).fly();
//            }
//            System.out.println(a);
//        }

        cat1.hunt();
    }
}