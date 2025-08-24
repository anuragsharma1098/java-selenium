package java_revamp.day_4_5;

import java.util.Scanner;

public class oops_5_user_dao {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number of users you want to create:");
            int size = scanner.nextInt();
            scanner.nextLine(); // consume leftover newline
            oops_5_user[] users = new oops_5_user[size];
            for (int i = 0; i < size; i++) {
                System.out.println("-------------------------");
                System.out.println("Enter user id:");
                int id = scanner.nextInt();
                scanner.nextLine(); // consume leftover newline
                System.out.println("Enter user name:");
                String name = scanner.nextLine();
                System.out.println("Enter user age:");
                int age = scanner.nextInt();
                scanner.nextLine(); // consume leftover newline
                System.out.println("Enter user address:");
                String address = scanner.nextLine();
                users[i] = new oops_5_user(id, name, age, address);
                System.out.println("-------------------------");
            }

            System.out.println("User details:");
            for (oops_5_user user : users) {
                System.out.println(user);
            }
        }
    }
}
