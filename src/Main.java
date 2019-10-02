import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // polymorphism type
        Animal sixten = new Dog("Sixten", 5_000, AnimalType.DOG);
        Animal dogge = new Dog("Dogge", 1_000, AnimalType.DOG);
        Animal venus = new Cat("Venus", 5_000, AnimalType.CAT);
        Animal ove = new Cat("Ove", 3_000, AnimalType.CAT);
        Animal hypno = new Snake("Hypno", 1, AnimalType.SNAKE);

        List<Animal> animals = Arrays.asList(sixten, dogge, venus, ove, hypno);

        String animalName = JOptionPane.showInputDialog(null, "Vilket djur ska få mat?");

        // AnimalType enum used to identify what kind of Animal to instantiate
        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(animalName)) {
                switch (animal.getType()) {
                    case DOG:
                        Dog dog = (Dog) animal;
                        dog.feed();
                        break;
                    case CAT:
                        Cat cat = (Cat) animal;
                        cat.feed();
                        break;
                    case SNAKE:
                        Snake snake = (Snake) animal;
                        snake.feed();
                        break;
                }
                System.exit(0);
            }
        }

        if(animalName != null){
            JOptionPane.showMessageDialog(null, "Ett djur med namnet " + animalName + " existerar inte.");
        }
    }
}