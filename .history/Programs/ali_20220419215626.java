package programs;

import java.util.*;

public class ali {
    public static void main(String[] args) {
        System.out.println();
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> l2 = new ArrayList<Integer>(5);
        list.add(9);
        list.add(8);
        list.add(7);
        list.add(6);
        list.add(5);
        l2.add(4);
        l2.add(3);
        l2.add(5);
        l2.add(10);
        l2.add(11);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.add(0, 6);
        list.add(3, 10);
        System.out.println();
        ;
        // for (int i = 0; i < list.size(); i++) {
        //     System.out.println(list.get(i));
        // }

        // By doing this we have added the two lists : 
        list.addAll(l2);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
