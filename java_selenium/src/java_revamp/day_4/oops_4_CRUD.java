package java_revamp.day_4;

import java.util.Scanner;

public class oops_4_CRUD {
    static class operation {
        private oops_4_CRUD_todo_entity td_object[];
        private int index;

        public operation(int size) {
            td_object = new oops_4_CRUD_todo_entity[size];
        }

        public void addtdobject(oops_4_CRUD_todo_entity td) {
            td_object[index++] = td;
        }

        public void display() {
            for (int i = 0; i < td_object.length; i++) {
                if (td_object[i] != null) {
                    System.out.println("Order ID: " + td_object[i].getOrder_id());
                    System.out.println("Order Name: " + td_object[i].getOrder_name());
                    System.out.println("Cost: " + td_object[i].getCost());
                    System.out.println("-------------------------");
                }
            }
        }

        public oops_4_CRUD_todo_entity findbyorderid(int order_id) {
            for (oops_4_CRUD_todo_entity td : td_object) {
                if (td != null && td.getOrder_id() == order_id) {
                    return td;
                }
            }
            return null;
        }

        public boolean deletebyorderid(int order_id) {
            for (int i = 0; i < td_object.length; i++) {
                if (td_object[i] != null && td_object[i].getOrder_id() == order_id) {
                    td_object[i] = null;
                    return true;
                }
            }
            return false;
        }

        public boolean updatebyorderid(int order_id, oops_4_CRUD_todo_entity new_td) {
            for (int i = 0; i < td_object.length; i++) {
                if (td_object[i] != null && td_object[i].getOrder_id() == order_id) {
                    td_object[i] = new_td;
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of orders you want to add:");
        int size = sc.nextInt();
        operation op = new operation(size);
        System.out.println("-------------------------");
        System.out.println("-------------------------");
        System.out.println("Enter the details");
        System.out.println("-------------------------");
        for (int i = 0; i < size; i++) {
            System.out.println("enter todo list " + (i + 1) + " details");
            oops_4_CRUD_todo_entity td = new oops_4_CRUD_todo_entity();
            System.out.println("Enter order id:");
            int order_id = sc.nextInt();
            td.setOrder_id(order_id);
            System.out.println("Enter order name:");
            String order_name = sc.next();
            td.setOrder_name(order_name);
            System.out.println("Enter cost:");
            int cost = sc.nextInt();
            td.setCost(cost);
            op.addtdobject(td);
            System.out.println("-------------------------");
        }
        do {
            System.out.println("-------------------------");
            System.out.println("-------------------------");
            System.out.println("1. Display all orders");
            System.out.println("2. Find order by ID");
            System.out.println("3. Delete order by ID");
            System.out.println("4. Update order by ID");
            System.out.println("5. Exit");
            System.out.println("-------------------------");
            System.out.println("-------------------------");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("-------------------------");
                    op.display();
                    System.out.println("-------------------------");
                    break;
                case 2:
                    System.out.println("-------------------------");
                    System.out.println("Enter order ID to find:");
                    int findId = sc.nextInt();
                    oops_4_CRUD_todo_entity foundOrder = op.findbyorderid(findId);
                    if (foundOrder != null) {
                        System.out.println("Order ID: " + foundOrder.getOrder_id());
                        System.out.println("Order found: " + foundOrder.getOrder_name());
                        System.out.println("Cost: " + foundOrder.getCost());
                    } else {
                        System.out.println("Order not found.");
                    }
                    System.out.println("-------------------------");
                    break;
                case 3:
                    System.out.println("-------------------------");
                    System.out.println("Enter order ID to delete:");
                    int deleteId = sc.nextInt();
                    if (op.deletebyorderid(deleteId)) {
                        System.out.println("Order deleted successfully.");
                    } else {
                        System.out.println("Order not found.");
                    }
                    System.out.println("-------------------------");
                    break;
                case 4:
                    System.out.println("-------------------------");
                    System.out.println("Enter order ID to update:");
                    int updateId = sc.nextInt();
                    oops_4_CRUD_todo_entity newTd = new oops_4_CRUD_todo_entity();
                    System.out.println("Enter new order name:");
                    String newName = sc.next();
                    newTd.setOrder_name(newName);
                    System.out.println("Enter new cost:");
                    int newCost = sc.nextInt();
                    newTd.setCost(newCost);
                    if (op.updatebyorderid(updateId, newTd)) {
                        System.out.println("Order updated successfully.");
                    } else {
                        System.out.println("Order not found.");
                    }
                    System.out.println("-------------------------");
                    break;
                case 5:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (true);
        // Close the scanner before exiting the main method
        // sc.close(); // Not needed here as it's already closed in case 5
    }
}