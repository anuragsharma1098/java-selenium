package java_revamp;

import java.util.Scanner;

public class ScanFunction_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // sc.next();
        // sc.nextInt();
        // sc.nextLine();
        // sc.nextFloat();
        // sc.nextDouble();
        // sc.nextBoolean();
        // sc.next().charAt(0);
        System.out.println("Enter name:");
        String s = sc.next();
        System.out.println(s);
        sc.close();
    }
}
