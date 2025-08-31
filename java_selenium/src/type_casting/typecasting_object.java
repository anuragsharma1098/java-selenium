package type_casting;

class Animal {
    void fetch1() {
        System.out.println("Fetching the ball!");
    }

    void makeSound1() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void makeSound2() {
        System.out.println("Woof!");
    }

    void fetch2() {
        System.out.println("Fetching the ball!");
    }
}

public class typecasting_object {
    public static void main(String[] args) {
        // Upcasting
        Animal animal = new Dog(); // Implicit upcasting
        animal.makeSound1(); // Output: Woof!
        // animal.makeSound2(); // Error: Cannot find symbol
        animal.fetch1(); // Output: Fetching the ball!
        // animal.fetch2(); // Error: Cannot find symbol

        // Downcasting
        Dog dog = (Dog) animal; // Explicit downcasting
        dog.makeSound1(); // Output: Woof!
        dog.fetch1(); // Output: Fetching the ball!
        dog.fetch2(); // Output: Fetching the ball!
        dog.makeSound2(); // Output: Woof!
    }

}
