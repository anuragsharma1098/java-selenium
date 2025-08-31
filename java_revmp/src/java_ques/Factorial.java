package java_ques;

import java.util.Scanner;

public class Factorial {
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0 || n == 1) {
            return 1; // Base case: 0! = 1 and 1! = 1
        }
        return n * factorial(n - 1); // Recursive case
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();
        scanner.close();
        long result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
