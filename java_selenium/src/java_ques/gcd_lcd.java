package java_ques;

import java.util.Scanner;

import java.util.Scanner;

public class gcd_lcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to find their GCD and LCD:");     
        int a = sc.nextInt();
        int b = sc.nextInt();
        // int a = 56; // Example number 1
        // int b = 98; // Example number 2

        System.out.println("Original numbers are: " + a + " and " + b);
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));
        System.out.println("LCD of " + a + " and " + b + " is: " + lcd(a, b));

    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public static int lcd(int a, int b) {
        return (a * b) / gcd(a, b);
    }

}
