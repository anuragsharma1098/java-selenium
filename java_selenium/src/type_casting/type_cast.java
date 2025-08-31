package type_casting;

public class type_cast {
    public static void main(String[] args) {
        // Implicit Type Casting (Widening)
        int num = 100;
        double bigNum = num; // int to double
        System.out.println("Implicit Type Casting:");
        System.out.println("Integer: " + num);
        System.out.println("Double: " + bigNum);

        // Explicit Type Casting (Narrowing)
        double decimalNum = 9.78;
        int smallNum = (int) decimalNum; // double to int
        System.out.println("\nExplicit Type Casting:");
        System.out.println("Double: " + decimalNum);
        System.out.println("Integer: " + smallNum);

        // Example of data loss during narrowing
        double largeDecimal = 9.99;
        int truncatedNum = (int) largeDecimal; // data loss occurs here
        System.out.println("\nData Loss Example:");
        System.out.println("Original Double: " + largeDecimal);
        System.out.println("Truncated Integer: " + truncatedNum);
    }
}
