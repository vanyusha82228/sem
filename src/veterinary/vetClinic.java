package veterinary;

import lesson1.*;

import java.util.ArrayList;
import java.util.List;

public class vetClinic {
     private final List<Animal> animals;

     public List<Animal> getAnimals() {
          return animals;
     }

     public vetClinic addAnimal(Animal animal){
          this.animals.add(animal);
          return this;
     }
     public  vetClinic(){
          this.animals = new ArrayList<>();
     }

     public List<Runble> getAllRunble(){
          List<Runble> runables = new ArrayList<>();
          for (Animal a: this.animals) {
               if(a instanceof Runble){
                    runables.add((Runble) a);
               }
          }
          return runables;
     }
     public List<Swimable> getAllSwim(){
          List<Swimable> swimables = new ArrayList<>();
          for (Animal a : this.animals){
               if(a instanceof  Swimable){
                    swimables.add((Swimable) a);
               }
          }

          return swimables;
     }
     public  List<Flyable> getAllFly(){
          List<Flyable> flyables = new ArrayList<>();
          for (Animal a: this.animals){
               if(a instanceof Flyable){
                    flyables.add((Flyable) a);
               }
          }
          return  flyables;
     }
     public List<Workble> getAllWork(){
          List<Workble> workbles = new ArrayList<>();
          for(Animal a: this.animals){
               if(a instanceof Workble){
                    workbles.add((Workble) a);
               }
          }
          return workbles;
     }
}
