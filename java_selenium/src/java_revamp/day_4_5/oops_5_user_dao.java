package java_revamp.day_4_5;

import java.util.Scanner;

public class oops_5_user_dao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size= scanner.nextInt();
        oops_5_user[] users = new oops_5_user[size];
        for (int i = 0; i < size; i++) {
            System.out.println("-------------------------");
            System.out.println("Enter user id:");
            int id = scanner.nextInt();
            System.out.println("Enter user name:");
            String name = scanner.nextLine();
            System.out.println("Enter user age:");
            int age = scanner.nextInt();
            System.out.println("Enter user address:");
            String address = scanner.nextLine();
            users[i] = new oops_5_user(id, name, age, address);
            System.out.println("-------------------------");
        }

    }

}
