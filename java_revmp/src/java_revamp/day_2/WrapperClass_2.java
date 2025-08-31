package java_revamp.day_2;

public class WrapperClass_2 {
    public static void main(String[] args) {
        // Creating a wrapper class object for an integer
        Integer intObj = Integer.valueOf(42);
        
        // Converting the wrapper class object to a primitive type
        int primitiveInt = intObj.intValue();
        
        // Printing the values
        System.out.println("Wrapper Class Object: " + intObj);
        System.out.println("Primitive Type Value: " + primitiveInt);
        int i=10;
        Integer i1 = Integer.valueOf(10);
        System.out.println("Primitive int: " + i);
        System.out.println("Wrapper Integer: " + i1);
        Boolean boolObj = Boolean.valueOf(true);
        System.out.println("Wrapper Boolean Object: " + boolObj);
        Character charObj = Character.valueOf('A');
        System.out.println("Wrapper Character Object: " + charObj);
        // int i=10;
        // Integer i1 = new Integer(10);
        // System.out.println("Primitive int: " + i);
        // System.out.println("Wrapper Integer: " + i1);
    }
}
