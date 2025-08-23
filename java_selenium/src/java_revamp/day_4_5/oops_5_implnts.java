package java_revamp.day_4_5;

interface Animal {
    void makeSound();
    void eat();
}
class cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    @Override
    public void eat() {
        System.out.println("The cat is eating.");
    }
}
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    @Override
    public void eat() {
        System.out.println("The dog is eating.");
    }
}
class Cow implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Moo!");
    }

    @Override
    public void eat() {
        System.out.println("The cow is eating.");
    }
}
public class oops_5_implnts {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound(); // Outputs: Woof!
        myDog.eat();       // Outputs: The dog is eating.

        Animal myCat = new cat();
        myCat.makeSound(); // Outputs: Meow!
        myCat.eat();       // Outputs: The cat is eating.

        Animal myCow = new Cow();
        myCow.makeSound(); // Outputs: Moo!
        myCow.eat();       // Outputs: The cow is eating.
    }
}
