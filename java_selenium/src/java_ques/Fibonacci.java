package java_ques;

import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base case: return n for 0 or 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate Fibonacci series up to that number: ");
        int number = scanner.nextInt();
        scanner.close();
        System.out.println("Fibonacci series up to " + number + ":");
        for (int i = 0; i < number; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
