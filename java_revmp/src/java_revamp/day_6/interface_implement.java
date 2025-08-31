package java_revamp.day_6;

// Defining the bike interface
interface bike {
    void run();// abstract method

    void changeGear(int newGear);// abstract method
    // default methods and static methods can also be defined in interfaces
}

// Implementing the bike interface in Honda class
class Honda implements bike {
    private int gear;// instance variable to hold the current gear

    @Override // Implementing the run method
    public void run() {
        System.out.println("Honda bike is running.");
    }

    @Override // Implementing the changeGear method
    public void changeGear(int newGear) {
        gear = newGear;// updating the gear
        System.out.println("Honda Gear changed to: " + gear);
    }
}

// Implementing the bike interface in Yamaha class
class Yamaha implements bike {
    private int gear;// instance variable to hold the current gear

    @Override // Implementing the run method
    public void run() {
        System.out.println("YAhama bike is running smoothly.");
    }

    @Override // Implementing the changeGear method
    public void changeGear(int newGear) {
        gear = newGear;// updating the gear
        System.out.println("Yamaha gear changed to: " + gear);
    }
}

public class interface_implement {
    public static void main(String[] args) {
        // Creating objects of Honda
        bike myBike = new Honda();
        myBike.run();// Outputs: Honda bike is running.
        myBike.changeGear(3);// Outputs: Honda Gear changed to: 3

        // Honda hondaBike = new Honda();
        // hondaBike.run();// Outputs: Honda bike is running.
        // hondaBike.changeGear(4);// Outputs: Honda Gear changed to: 4

        // Creating object of Yamaha
        bike myYamaha = new Yamaha();
        myYamaha.run();// Outputs: Yamaha bike is running smoothly.
        myYamaha.changeGear(5);// Outputs: Yamaha gear changed to: 5

        // Yamaha yamahaBike = new Yamaha();
        // yamahaBike.run();// Outputs: Yamaha bike is running smoothly.
        // yamahaBike.changeGear(6);// Outputs: Yamaha gear changed to: 6

    }

}
