package java_revamp.day_6;

class A {
    int a = 100;

    void display() {
        System.out.println("Class A method " + a);
    }
}

class B extends A {
    int b = 200;

    void show() {
        System.out.println("Class B method " + b);
    }
}

class C extends B {
    int c = 300;

    void print() {
        System.out.println("Class C method " + c);
    }
}

public class single_multilevel_inheritance {
    public static void main(String[] args) {
        // single level inheritence
        A obja = new A();
        System.out.println(obja.a);
        // obja.show(); // Compile time error
        obja.display();
        B objb = new B();
        System.out.println(objb.a);
        System.out.println(objb.b);
        objb.display();
        objb.show();

        // multilevel inheritence
        C objc = new C();
        objc.a = 111;
        objc.b = 222;
        objc.c = 333;
        objc.display();
        objc.show();
        objc.print();
    }

}
