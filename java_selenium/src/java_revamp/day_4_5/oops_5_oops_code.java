package java_revamp.day_4_5;

class Shape {
    public double getArea() {
        return 0.0;
    }
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}

class Rectangle extends Shape {
    private double length, breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double getArea() {
        return length * breadth;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class oops_5_oops_code {
    public static void main(String[] args) {
        Square sq = new Square(4);
        Rectangle rect = new Rectangle(5, 3);
        Circle cir = new Circle(2.5);
        System.out.println("Area of Square: " + sq.getArea());
        System.out.println("Area of Rectangle: " + rect.getArea());
        System.out.println("Area of Circle: " + cir.getArea());
    }
}