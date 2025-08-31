package wrapperclass;

public class wrap_class {
    public static void main(String[] args) {
        String str = "123";
        String str1 = "12.33";
        String str2 = "true";
        int num = Integer.parseInt(str);
        double d = Double.parseDouble(str1);
        boolean b = Boolean.parseBoolean(str2);
        System.out.println("Converted number: " + num);
        System.out.println("Converted double: " + d);
        System.out.println("Converted boolean: " + b);
        System.out.println(Integer.parseInt(str) + Double.parseDouble(str1));
    }
}
