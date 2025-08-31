package collectionss;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class arraylist_demo {
    public static void main(String[] args) {
        ArrayList mylist = new ArrayList();// non generic arraylist
        mylist.add(10);
        mylist.add("hello");
        mylist.add(15.5);
        System.out.println(mylist);
        ArrayList<Integer> mylist1 = new ArrayList<Integer>();// generic arraylist
        mylist1.add(10);
        mylist1.add(20);
        mylist1.add(30);
        System.out.println(mylist1);
        // all methods of arraylist
        mylist1.add(1, 15);// add element at specific index
        System.out.println(mylist1);
        mylist1.remove(2);// remove element at specific index
        System.out.println(mylist1);
        System.out.println(mylist1.get(1));// get element at specific index
        System.out.println(mylist1.size());// size of arraylist
        System.out.println(mylist1.contains(15));// check if element is present in arraylist
        System.out.println(mylist1.isEmpty());// check if arraylist is empty
        mylist1.clear();// clear all elements from arraylist
        System.out.println(mylist1);
        System.out.println(mylist1.size());
        System.out.println(mylist1.isEmpty());
        ArrayList<String> mylist2 = new ArrayList<String>();
        mylist2.add("apple");
        mylist2.add("banana");
        mylist2.add("cherry");
        System.out.println(mylist2);
        for (String fruit : mylist2) {
            System.out.println(fruit);
        }
        Iterator<String> it = mylist2.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
