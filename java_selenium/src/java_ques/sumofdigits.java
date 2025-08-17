package java_ques;

import java.util.Scanner;

public class sumofdigits {
    
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        //int number = 12345; // Example input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        int result = sumOfDigits(number);
        System.out.println("The sum of digits of " + number + " is: " + result);
    }
}
