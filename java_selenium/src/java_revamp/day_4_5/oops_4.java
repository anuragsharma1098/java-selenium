package java_revamp.day_4_5;

class Employee {
    String name;
    int age;
    String department;

    Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Department: " + department);
    }
}

public class oops_4 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 30, "HR");
        Employee emp2 = new Employee("Bob", 25, "IT");

        emp1.displayInfo();
        emp2.displayInfo();

    }
}
