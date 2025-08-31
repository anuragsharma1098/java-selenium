package java_revamp.day_4_5;

import java.util.Scanner;

public class oops_5_polymorphism {

    void sum(int a, int b) {
        System.out.println("Sum of two integers: " + (a + b));
    }

    void sum(double a, double b) {
        System.out.println("Sum of two doubles: " + (a + b));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        System.out.println("Enter two doubles:");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        sc.nextLine(); // Consume the newline character
        oops_5_polymorphism obj = new oops_5_polymorphism();
        // Method overloading
        obj.sum(a, b); // Calls the method with integer parameters  
        obj.sum(x, y); // Calls the method with double parameters
        sc.close();
    }
}
