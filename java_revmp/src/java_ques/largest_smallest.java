package java_ques;

import java.util.Scanner;

public class largest_smallest {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        sc.close();
        int largest = findLargestDigit(number);
        int smallest = findSmallestDigit(number);
        System.out.println("Largest digit in " + number + " is: " + largest);
        System.out.println("Smallest digit in " + number + " is: " + smallest);
    }

    public static int findLargestDigit(int num) {
        int largest = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit > largest) {
                largest = digit;
            }
            num /= 10;
        }
        return largest;
    }

    public static int findSmallestDigit(int num) {
        int smallest = 9; // Start with the largest possible digit
        while (num > 0) {
            int digit = num % 10;
            if (digit < smallest) {
                smallest = digit;
            }
            num /= 10;
        }
        return smallest;
    }
}
