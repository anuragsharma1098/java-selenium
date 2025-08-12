package java_ques;

import java.util.Scanner;

public class gcd_lcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to find GCD and LCD:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        // Uncomment the next line to use hardcoded values for testing
        // int a = 12, b = 15; // Example numbers
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
