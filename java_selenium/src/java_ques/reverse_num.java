package java_ques;

import java.util.Scanner;

public class reverse_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse:");
        int number = sc.nextInt();
        sc.close();
        System.out.println("Original number is: " + number);
        int reversedNumber = revnum(number);
        System.out.println("Reversed number is: " + reversedNumber);
    }

    public static int revnum(int num) {
        int r = 0;
        while (num > 0) {
            int t = num % 10;
            r = r * 10 + t;
            num = num / 10;
        }
        return r;
    }
}