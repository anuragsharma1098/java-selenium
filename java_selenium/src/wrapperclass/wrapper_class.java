package wrapperclass;

public class wrapper_class {
    public static void main(String[] args) {
        // Primitive data types
        int num = 10;
        double decimalNum = 20.5;
        String str = "Hello";
        char character = 'A';
        boolean isTrue = true;

        // Converting primitive data types to wrapper classes
        Integer wrappedNum = Integer.valueOf(num);
        Double wrappedDecimalNum = Double.valueOf(decimalNum);
        Character wrappedCharacter = Character.valueOf(character);
        Boolean wrappedIsTrue = Boolean.valueOf(isTrue);
        String wrappedStr = str; // String is already a class

        // Displaying the values of wrapper classes
        System.out.println("Wrapped Integer: " + wrappedNum);
        System.out.println("Wrapped Double: " + wrappedDecimalNum);
        System.out.println("Wrapped Character: " + wrappedCharacter);
        System.out.println("Wrapped Boolean: " + wrappedIsTrue);
        System.out.println("Wrapped String: " + wrappedStr);

        // Converting wrapper classes back to primitive data types
        int unwrappedNum = wrappedNum.intValue();
        double unwrappedDecimalNum = wrappedDecimalNum.doubleValue();
        char unwrappedCharacter = wrappedCharacter.charValue();
        boolean unwrappedIsTrue = wrappedIsTrue.booleanValue();

        // Displaying the values of unwrapped primitive data types
        System.out.println("Unwrapped Integer: " + unwrappedNum);
        System.out.println("Unwrapped Double: " + unwrappedDecimalNum);
        System.out.println("Unwrapped Character: " + unwrappedCharacter);
        System.out.println("Unwrapped Boolean: " + unwrappedIsTrue);
        System.out.println("Unwrapped String: " + wrappedStr);
    }
}
