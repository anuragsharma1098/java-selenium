package collectionss;

import java.util.HashSet;

public class hashset_demo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("Apple");
        set.add("apple"); // Case-sensitive, will be added
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // Duplicate, will not be added
        set.add(null); // Adding null value
        set.add(null); // Duplicate null, will not be added
        System.out.println("HashSet: " + set);
        System.out.println("Contains 'Banana': " + set.contains("Banana"));
        set.remove("Orange");
        System.out.println("After removing 'Orange': " + set);
        System.out.println("Size of HashSet: " + set.size());
        set.clear();
        System.out.println("Is HashSet empty? " + set.isEmpty());

    }
}
