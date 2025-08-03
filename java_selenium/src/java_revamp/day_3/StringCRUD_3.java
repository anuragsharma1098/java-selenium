package java_revamp.day_3;

public class StringCRUD_3 {
    public static void main(String[] args) {
        //Creating an array of name in string format and perform CRUD on it
        String[] names = {"John", "Jane", "Doe", "Alice", "Bob"};

        // Create: Adding a new name
        String newName = "Charlie";
        String[] newNames = new String[names.length + 1];
        System.arraycopy(names, 0, newNames, 0, names.length);
        newNames[names.length] = newName;
        names = newNames;

        // Read: Displaying all names
        System.out.println("Names in the array:");
        for (String name : names) {
            System.out.println(name);
        }

        // Update: Changing a name
        names[2] = "David"; // Changing "Doe" to "David"

        // Read again to see the updated names
        System.out.println("\nUpdated Names in the array:");
        for (String name : names) {
            System.out.println(name);
        }

        // Delete: Removing a name
        int indexToRemove = 1; // Removing "Jane"
        String[] updatedNames = new String[names.length - 1];
        for (int i = 0, j = 0; i < names.length; i++) {
            if (i != indexToRemove) {
                updatedNames[j++] = names[i];
            }
        }
        names = updatedNames;

        // Final read to see the remaining names
        System.out.println("\nFinal Names in the array after deletion:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
