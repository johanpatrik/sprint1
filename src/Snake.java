import javax.swing.*;

// Polymorphism, extends class
public class Snake extends Animal {

    public Snake(String name, int weight, AnimalType type) {
        super(name, weight, type);
    }

    // Overloading, static polymorphism
    public void feed() {
        JOptionPane.showMessageDialog(null, "20 gram ormpellets");
    }
}
