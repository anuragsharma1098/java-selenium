package java_revamp.day_3;

public class Strings_3 {
    public static void main(String[] args) {
        String str = "Hello World";
        String str2 = new String("Hello World");

        // Check if both strings are equal
        if (str.equals(str2)) {
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }

        // Check if both strings are the same object
        if (str == str2) {
            System.out.println("Both strings are the same object.");
        } else {
            System.out.println("Strings are not the same object.");
        }

        //perform all proposals om string str2
        str2 = str2.toUpperCase();
        System.out.println("Uppercase str2: " + str2); 
        str2 = str2.toLowerCase();
        System.out.println("Lowercase str2: " + str2);
        str2 = str2.trim();
        System.out.println("Trimmed str2: " + str2);
        str2 = str2.replace("hello", "hi"); 
        System.out.println("Replaced 'hello' with 'hi': " + str2);
        str2 = str2.substring(0, 5);
        System.out.println("Substring of str2: " + str2);
        str2 = str2.concat(" World");
        System.out.println("Concatenated str2: " + str2);
        str2 = str2 + "!";
        System.out.println("Final str2: " + str2);
        // Check if str2 contains "World"
        if (str2.contains("World")) {
            System.out.println("str2 contains 'World'.");
        } else {
            System.out.println("str2 does not contain 'World'.");
        }
        // Check if str2 starts with "Hello"
        if (str2.startsWith("Hello")) {
            System.out.println("str2 starts with 'Hello'.");
        } else {
            System.out.println("str2 does not start with 'Hello'.");
        }
        // Check if str2 ends with "World"
        if (str2.endsWith("World")) {   
            System.out.println("str2 ends with 'World'.");
        } else {
            System.out.println("str2 does not end with 'World'.");
        }
        // Get the length of str2
        int length = str2.length();
        System.out.println("Length of str2: " + length);
        // Get the character at index 0 of str2
        char firstChar = str2.charAt(0);
        System.out.println("First character of str2: " + firstChar);
        // Get the index of 'W' in str2
        int indexOfW = str2.indexOf('W');
        System.out.println("Index of 'W' in str2: " + indexOfW);
        // Get the last index of 'o' in str2
        int lastIndexOfO = str2.lastIndexOf('o');
        System.out.println("Last index of 'o' in str2: " + lastIndexOfO);
        // Split str2 by space
        String[] words = str2.split(" ");
        System.out.println("Words in str2:");
        for (String word : words) {
            System.out.println(word);
        }
        // Convert str2 to a character array
        char[] charArray = str2.toCharArray();
        System.out.println("Character array of str2:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();
        // Check if str2 is empty   
        if (str2.isEmpty()) {
            System.out.println("str2 is empty.");
        } else {
            System.out.println("str2 is not empty.");
        }
        // Check if str2 is blank
        if (str2.isBlank()) {
            System.out.println("str2 is blank.");
        } else {
            System.out.println("str2 is not blank.");
        }
        // Check if str2 is equal to "hello world" ignoring case
        if (str2.equalsIgnoreCase("hello world")) {
            System.out.println("str2 is equal to 'hello world' ignoring case.");
        } else {
            System.out.println("str2 is not equal to 'hello world' ignoring case.");
        }
        // Check if str2 matches a regex pattern
        if (str2.matches(".*World.*")) {
            System.out.println("str2 matches the regex pattern '.*World.*'.");
        } else {
            System.out.println("str2 does not match the regex pattern '.*World.*'.");
        }
        // Convert str2 to a byte array
        byte[] byteArray = str2.getBytes();
        System.out.println("Byte array of str2:");
        for (byte b : byteArray) {
            System.out.print(b + " ");
        }
        System.out.println();
        // Convert str2 to a StringBuilder  
        StringBuilder stringBuilder = new StringBuilder(str2);
        System.out.println("StringBuilder from str2: " + stringBuilder);
        // Convert StringBuilder back to String
        String strFromBuilder = stringBuilder.toString();   
        System.out.println("String from StringBuilder: " + strFromBuilder);
        // Check if str2 is a palindrome
        String reversedStr2 = new StringBuilder(str2).reverse().toString();
        if (str2.equals(reversedStr2)) {
            System.out.println("str2 is a palindrome.");
        } else {
            System.out.println("str2 is not a palindrome.");
        }
        // // Check if str2 is a valid email address
        // if (str2.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
        //     System.out.println("str2 is a valid email address.");
        // } else {
        //     System.out.println("str2 is not a valid email address.");
        // }
        // // Check if str2 is a valid URL
        // if (str2.matches("^(http|https)://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}.*$")) {
        //     System.out.println("str2 is a valid URL.");
        // } else {
        //     System.out.println("str2 is not a valid URL.");
        // }
        // // Check if str2 is a valid phone number
        // if (str2.matches("^\\+?[0-9]{1,3}?[-]?[0-9]{10}$")) {
        //     System.out.println("str2 is a valid phone number.");
        // } else {
        //     System.out.println("str2 is not a valid phone number.");
        // }
        // // Check if str2 is a valid date in the format "dd/MM/yyyy"
        // if (str2.matches("^\\d{2}/\\d{2}/\\d{4}$")) {
        //     System.out.println("str2 is a valid date in the format 'dd/MM/yyyy'.");
        // } else {
        //     System.out.println("str2 is not a valid date in the format 'dd/MM/yyyy'.");
        // }
        // // Check if str2 is a valid time in the format "HH:mm"
        // if (str2.matches("^([01]?[0-9]|2[0-3]):[0-5][0-9]$")) {
        //     System.out.println("str2 is a valid time in the format 'HH:mm'.");
        // } else {
        //     System.out.println("str2 is not a valid time in the format 'HH:mm'.");
        // }
        // // Check if str2 is a valid JSON object
        // if (str2.matches("^\\{.*\\}$")) {
        //     System.out.println("str2 is a valid JSON object.");
        // } else {
        //     System.out.println("str2 is not a valid JSON object.");
        // }
        // // Check if str2 is a valid XML element
        // if (str2.matches("^<\\w+>.*</\\w+>$")) {
        //     System.out.println("str2 is a valid XML element.");
        // } else {
        //     System.out.println("str2 is not a valid XML element.");
        // }
        // // Check if str2 is a valid UUID
        // if (str2.matches("^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$")) {
        //     System.out.println("str2 is a valid UUID.");
        // } else {
        //     System.out.println("str2 is not a valid UUID.");
        // }
    }
    
}
