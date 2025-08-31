package java_ques;

import java.util.Scanner;

public class digit_count {
    public static void main(String[] args) {
        //int number = 12345; // Example number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        //double number = scanner.nextDouble(); // Allowing for decimal numbers
        scanner.close();
        int count = countDigits(number);
        //double count = countDigits(number); // Use the modified method to count digits
        System.out.println("The number of digits in " + number + " is: " + count);
    }

    public static int countDigits(int num) {
        if (num == 0) return 1; // Special case for zero
        int count = 0;
        //while (Math.abs(num) != 0) {
        while (num != 0) {
            num /= 10; // Remove the last digit
            count++;
        }
        return count;
    }
    // public static double countDigits(double num) {
    //     if (num == 0) return 1; // Special case for zero
    //     String numStr = String.valueOf(Math.abs(num)); // Convert to string and handle absolute value
    //     int count = 0;
    //     for (char c : numStr.toCharArray()) {
    //         if (Character.isDigit(c)) { // Count only digit characters
    //             count++;
    //         }
    //     }
    //     return count;
    // }
}
