package java_revamp.day_4_5;

public class oops_5_main_overloading {
    void main(int x) {
        System.out.println("int main");
    }

    void main(String s) {
        System.out.println("String main");
    }

    void main(String s1, String s2) {
        System.out.println(s1 + s2);
    }

    public static void main(String[] args) {
        oops_5_main_overloading obj = new oops_5_main_overloading();
        obj.main(10);
        obj.main("James");
        obj.main("Hello", "John");
    }

}
