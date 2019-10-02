// Polymorphism, extends class
public class Cat extends Animal {

    public Cat(String name, int weight, AnimalType type) {
        super(name, weight, type);
    }

    // Overloading, static polymorphism
    public void feed() {
        super.feed(150, "kattfoder");
    }
}
