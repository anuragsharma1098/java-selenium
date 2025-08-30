package java_revamp.day_6;

class Parent {
    int a = 100;

    void display() {
        System.out.println("Parent class method " + a);
    }
}

class Child1 extends Parent {
    int b = 200;

    void show() {
        System.out.println("Child1 class method " + b);
    }
}

class Child2 extends Parent {
    int c = 300;

    void print() {
        System.out.println("Child2 class method " + c);
    }
}

class Child3 extends Parent {
    int d = 400;

    void msg() {
        System.out.println("Child3 class method " + d);
    }
}

public class hierarchy_inheritance {
    public static void main(String[] args) {
        Parent objp = new Parent();
        System.out.println(objp.a);
        objp.display();

        Child1 objc1 = new Child1();
        System.out.println(objc1.a);
        System.out.println(objc1.b);
        objc1.display();
        objc1.show();

        Child2 objc2 = new Child2();
        System.out.println(objc2.a);
        System.out.println(objc2.c);
        objc2.display();
        objc2.print();

        Child3 objc3 = new Child3();
        System.out.println(objc3.a);
        System.out.println(objc3.d);
        objc3.display();
        objc3.msg();
    }

}
