package java_revamp.day_6;

public class staticc {
    static int a = 10; // static variable
    int b = 20; // instance variable

    static void m1() { // static method
        System.out.println("static method");
    }

    void m2() { // instance method
        System.out.println("instance method");
    }

    void m(){
        System.out.println(a); // accessing static variable inside instance method
        m1(); // accessing static method inside instance method
        System.out.println(b); // accessing instance variable inside instance method
        m2(); // accessing instance method inside instance method
    }

    public static void main(String[] args) {
        System.out.println(a); // accessing static variable without creating object
        m1(); // accessing static method without creating object

        staticc s = new staticc(); // creating object to access instance variable and method
        System.out.println(s.b); // accessing instance variable
        s.m2(); // accessing instance method
        s.m(); // accessing instance method that accesses both static and instance members
    }
    
}
