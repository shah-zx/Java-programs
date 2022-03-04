package out;

import java.util.ArrayList;

public class Array_list {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list + "->" + list.size()); // This will giv us an empty list //
        // Adding the elements in the list //
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(3, 400);
        System.out.println(list);
        System.out.println(list + "->" + list.size()); // This will giv us an empty list //
        list.set(3, 40); // This will set the number at the given index
        list.remove(2);
        System.out.println(list);
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Developer");
        list2.add("Designer");
        list2.add("Manager");
        System.out.println(list2 + "->" + list2.size());
    }
}
