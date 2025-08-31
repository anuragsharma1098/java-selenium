package java_revamp.day_4_5;

class box {

    double length;
    double breadth;
    double height;

    box() {
        this.length = 0;
        this.breadth = 0;
        this.height = 0;

    }

    box(double l, double b, double h) {
        this.length = l;
        this.breadth = b;
        this.height = h;
    }

    box(double side) {
        this.length = side;
        this.breadth = side;
        this.height = side;
    }

    double volume() {
        return length * breadth * height;
    }

    void display() {
        System.out.println("This is box class");
    }
}

class boxtype extends box {
    void display() {
        System.out.println("This is boxtype class");
    }
}

public class oops_5 {
    public static void main(String[] args) {
        box b1 = new box();
        box b2 = new box(10, 20, 30);
        box b3 = new box(5);
        boxtype b4 = new boxtype();
        // Method Overloading -> same method name with different parameters
        System.out.println("Volume of b1: " + b1.volume());
        System.out.println("Volume of b2: " + b2.volume());
        System.out.println("Volume of b3: " + b3.volume());
        b4.length = 10;
        b4.breadth = 20;
        b4.height = 30;
        System.out.println("Volume of b4: " + b4.volume());
        // Method Overriding -> same method name with same parameters in parent and child class
        b1.display();
        b4.display();

    }

}
