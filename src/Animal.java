import javax.swing.*;

// Polymorphism, implements interface
public abstract class Animal implements IDiet {
    private String name;
    private int weight;
    private AnimalType type;

    public Animal(String name, int weight, AnimalType type) {
        this.name = name;
        this.weight = weight;
        this.type = type;
    }

    public void feed(int portion, String foodType) {
        int foodWeight = this.getWeight() / portion;
        JOptionPane.showMessageDialog(null, foodWeight + " gram " + foodType);
    }

    // All methods below are incapsulating the fields
    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public AnimalType getType() {
        return type;
    }
}