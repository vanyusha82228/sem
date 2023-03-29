public class dog extends Animal {
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
}
