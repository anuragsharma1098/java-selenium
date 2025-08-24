package java_revamp.day_6;

interface AnimalEat {
    void eat();
}

interface AnimalTravel {
    void travel();
}

class Animal implements AnimalEat, AnimalTravel {
    public void eat() {
        System.out.println("Animal is eating");
    }

    public void travel() {
        System.out.println("Animal is travelling");
    }
}

public class multiple_inheritance {
    public static void main(String[] args) {
        System.out.println("Java class does not support" +
                " multiple inheritance");
        System.out.println("But we can achieve multiple" +
                " inheritance using interfaces");
        Animal a = new Animal();
        a.eat();
        a.travel();
    }
}
