package java_revamp.day_4_5;

public class oops_5_user {
    private int id;
    private String name;
    private int age;
    private String address;

    public oops_5_user(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // add new user method
    public void addUser(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // update user method
    public void updateUser(int id, String name, int age, String address) {
        if (this.id == id) {
            this.name = name;
            this.age = age;
            this.address = address;
        } else {
            System.out.println("User ID not found.");
        }
    }

    // delete user method
    public void deleteUser(int id) {
        if (this.id == id) {
            this.id = 0;
            this.name = null;
            this.age = 0;
            this.address = null;
            System.out.println("User deleted successfully.");
        } else {
            System.out.println("User ID not found.");
        }
    }

    // find user method
    public oops_5_user findUser(int id) {
        if (this.id == id) {
            return this;
        } else {
            System.out.println("User ID not found.");
            return null;
        }
    }

    // display user method
    public void displayUser() {
        System.out.println("User ID: " + id);
        System.out.println("User Name: " + name);
        System.out.println("User Age: " + age);
        System.out.println("User Address: " + address);
        System.out.println("-------------------------");
    }

    // display all users method
    public static void displayAllUsers(oops_5_user[] users) {
        for (oops_5_user user : users) {
            if (user != null) {
                user.displayUser();
            } else {
                System.out.println("No user found at this index.");
            }
        }
    }
    // toString method for displaying user details

    @Override
    public String toString() {
        return "\n" +
                "  ID=      " + id + "\n" +
                "  NAME=    " + name + "\n" +
                "  AGE=     " + age + "\n" +
                "  ADDRESS= " + address + "\n"
                + "-------------------------";
    }

}
