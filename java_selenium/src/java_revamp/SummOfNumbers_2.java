package java_revamp;

class Calculator{
    int a;
    int b;
    public int add(int a, int b) {
        this.a = a;
        this.b = b;
        return a+b;
    }

    public int sub() {
        this.a=23;
        return a-b;
    }
}
public class SummOfNumbers_2 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator);
        int sum = calculator.add(5, 10);
        System.out.println("The sum of the numbers is: " + sum);
        System.out.println("The difference of the numbers is: " 
        + calculator.sub());
    }
    
}
