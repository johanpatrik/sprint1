// Polymorphism, extends class
public class Dog extends Animal{

    public Dog(String name, int weight, AnimalType type) {
        super(name, weight, type);
    }

    // Overloading, static polymorphism
    public void feed() {
        super.feed(100,"hundfoder");
    }
}
