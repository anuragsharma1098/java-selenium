package java_revamp;

public class TypeCasting_2 {
    public static void main(String[] args) {
        // Implicit type casting (widening conversion)
        int intValue = 100;
        long longValue = intValue; // int to long
        float floatValue = longValue; // long to float
        double doubleValue = floatValue; // float to double

        System.out.println("Implicit Type Casting:");
        System.out.println("Integer value: " + intValue);
        System.out.println("Long value: " + longValue);
        System.out.println("Float value: " + floatValue);
        System.out.println("Double value: " + doubleValue);

        // Explicit type casting (narrowing conversion)
        double d = 9.78;
        float f = (float) d; // double to float
        long l = (long) f; // float to long
        int i = (int) l; // long to int
        short s = (short) i; // int to short
        byte b = (byte) s; // short to byte

        System.out.println("\nExplicit Type Casting:");
        System.out.println("Double value: " + d);
        System.out.println("Float value: " + f);
        System.out.println("Long value: " + l);
        System.out.println("Integer value: " + i);
        System.out.println("Short value: " + s);
        System.out.println("Byte value: " + b);
    }
}
