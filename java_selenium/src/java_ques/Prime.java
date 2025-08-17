package java_ques;

import java.util.Scanner;

public class Prime {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Found a divisor, so n is not prime
            }
        }
        return true; // No divisors found, n is prime
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime: ");
        int number = scanner.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // Additional functionality to print all prime numbers between two numbers
        System.out.print("Enter two numbers to print all prime numbers between them: ");
        System.out.print("Enter first number: ");
        int first_num = scanner.nextInt();
        System.out.print("Enter second number: ");
        int second_num = scanner.nextInt();
        scanner.close();
        System.out.println("Prime numbers between " + first_num + " and " + second_num + ":");
        for (int i = first_num; i <= second_num; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
