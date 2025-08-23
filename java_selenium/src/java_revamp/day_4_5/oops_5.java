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
}

public class oops_5 {
    public static void main(String[] args) {
        box b1 = new box();
        box b2 = new box(10, 20, 30);
        box b3 = new box(5);
        System.out.println("Volume of b1: " + b1.volume());
        System.out.println("Volume of b2: " + b2.volume());
        System.out.println("Volume of b3: " + b3.volume());
    }

}
