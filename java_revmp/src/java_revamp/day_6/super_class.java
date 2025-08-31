package java_revamp.day_6;
// Superclass
class Animall {
    // Instance variable
    String color = "white";

    // Default constructor
    Animall() {
        System.out.println("Animal constructor called");
    }

    // Method to display a sound
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass inheriting from Animal
class Dogg extends Animall {
    // Instance variable with the same name as in superclass
    String color = "black";

    // Default constructor
    Dogg() {
        super(); // Calls the constructor of the superclass (Animal)
        System.out.println("Dog constructor called");
    }

    // Method overriding the superclass method
    @Override
    void sound() {
        super.sound(); // Calls the sound() method of the superclass (Animal)
        System.out.println("Dog barks");
    }

    // Method to display colors from both classes
    void displayColors() {
        System.out.println("Dog color: " + color); // Accesses Dog's color
        System.out.println("Animal color: " + super.color); // Accesses Animal's color
    }

   
}   
public class super_class {
     // Main method to test the program
    public static void main(String[] args) {
        Dogg d = new Dogg(); // Creates a Dog object, invoking both constructors
        d.sound(); // Calls the overridden sound() method
        d.displayColors(); // Calls the method to display colors
    }
}
