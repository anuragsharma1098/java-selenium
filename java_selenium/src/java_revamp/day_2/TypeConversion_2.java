package java_revamp.day_2;

import java.util.Scanner;

public class TypeConversion_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = "123";
        int i = Integer.parseInt(s);
        System.out.println(i);
        
        String s2 = "123.45";
        double d = Double.parseDouble(s2);
        System.out.println(d);
        
        String s3 = "true";
        boolean b = Boolean.parseBoolean(s3);
        System.out.println(b);
        
        String s4 = "A";
        char c = s4.charAt(0);
        System.out.println(c);

        int f = scanner.nextInt();
        System.out.println((float)f);

        float f1 = scanner.nextFloat();
        float f2 = 12.78f;
        System.out.println((int)f1);
        System.out.println((int)f2+" "+(int)(f1));

        String ss = "12345";
        int i2 = 18;
        int i1 = Integer.parseInt(ss);
        System.out.println(i2+ss);
        System.out.println(i1 + i2);

        scanner.close();
    }

}
