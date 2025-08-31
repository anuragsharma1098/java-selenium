package collectionss;

import java.util.HashMap;

public class hashmap_demo {
    public static void main(String[] args) {

        HashMap mapp =new HashMap();//non generic
        // HashMap is a class that implements the Map interface
        // It is a part of the Java Collections Framework
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        System.out.println(map);
        System.out.println(map.get(3));
        System.out.println(map.containsKey(5));
        System.out.println(map.containsValue("four"));
        System.out.println(map.size());
        map.remove(2);
        System.out.println(map);
        map.put(4, "updated four");
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        map.clear();
        System.out.println(map);
    }
}
