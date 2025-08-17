package java_ques;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is an Armstrong number:");
        int number = sc.nextInt();
        sc.close();
        // int number = 153; // Example number to check
        System.out.println("Original number is: " + number);
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
    // public static boolean isArmstrong(int num) {
    // int originalNum = num;
    // int sum = 0;
    // int digits = String.valueOf(num).length();

    // while (num > 0) {
    // int digit = num % 10;
    // sum += Math.pow(digit, digits);
    // num /= 10;
    // }

    // return sum == originalNum;
    // }
    public static boolean isArmstrong(int num) {
        int onum = num;
        int s = 0;
        String str = String.valueOf(num);
        int digits = str.length();
        while (num > 0) {
            int d = num % 10;
            s += Math.pow(d, digits);
            num /= 10;
        }
        if (s == onum)
            return true;
        else
            return false;
    }
}
