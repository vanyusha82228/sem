public class Cat extends Animal {
    public Cat(String name, String color) {
        super(name, color,4);
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("мууур");
    }
    private void wakeUp(){
        System.out.println("кот проснулся...");
    }

    public void toPlat(){
        System.out.println(" кот Играет...");
    }

    private void eat(){
        System.out.println("кот ate..");
    }

    private void findFood(){
        System.out.println("кот нашел еду");
    }
    public void goToSleep(){
        System.out.println("кот спит...");
    }

    public void hunt(){
        wakeUp();
        findFood();
        eat();
    }
}
