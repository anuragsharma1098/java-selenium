package java_ques;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        if(n%2==0)
        System.out.println(n+" Is Even");
        else
        System.out.println(n+" Is Odd");
        sc.close();
    }
}
