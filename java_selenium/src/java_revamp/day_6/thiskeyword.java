package java_revamp.day_6;

public class thiskeyword {
    int a;
    int b;

    thiskeyword(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void display() {
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
    }

    public static void main(String[] args) {
        thiskeyword obj = new thiskeyword(10, 20);
        obj.display();
    }
}
