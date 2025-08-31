package java_ques;

import java.util.Scanner;

public class sortdigits {
    public static void main(String[] args) {
        // Example usage of the sortdigits class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to sort its digits:");
        int number = sc.nextInt();
        sc.close();
        sortDigits(number);
    }

    // public static String sortDigits(int num) {
    //     StringBuilder sb = new StringBuilder();
    //     while (num > 0) {
    //         int t = num % 10;
    //         sb.append(t);
    //         num = num / 10;
    //     }
    //     char[] digits = sb.toString().toCharArray();
    //     java.util.Arrays.sort(digits);
    //     return new String(digits);

    // }

    public static void sortDigits(int num) {
        String s= String.valueOf(num);
        int a[] = new int[s.length()];
        int t;
        for(int i=0;i<s.length();i++) {
            t=num%10;
            a[i]=t;
            num=num/10;
        }
       java.util.Arrays.sort(a);
        System.out.print("Sorted digits in ascending order: ");
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i]);
        }
        System.out.println(); // For better readability
        System.out.print("Sorted digits in descending order: ");
        for(int i=a.length-1;i>=0;i--) {
            System.out.print(a[i]);
        }
    }   
}
