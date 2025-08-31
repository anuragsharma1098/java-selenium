package java_ques;

import java.util.Scanner;


public class Swap_num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        scanner.close();
        //Swap s = new Swap(); 
        Swap.swapwithouttemp(a, b);
        Swap.swapwithtemp(a, b);
        System.out.println("Swapping completed.");
    }
}

class Swap {
    public static void swapwithouttemp(int a, int b) {
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a + b; // Step 1: Add both numbers
        b = a - b; // Step 2: Subtract new value of 'a' with 'b' to get original 'a'
        a = a - b; // Step 3: Subtract new value of 'b' from new value of 'a' to get original 'b'
        System.out.println("After swapping without temp: a = " + a + ", b = " + b);
    }
    
    public static void swapwithtemp(int a, int b) {
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        int temp = a; // Step 1: Store 'a' in a temporary variable
        a = b; // Step 2: Assign 'b' to 'a'
        b = temp; // Step 3: Assign the temporary variable to 'b'
        System.out.println("After swapping with temp: a = " + a + ", b = " + b);
    }
}