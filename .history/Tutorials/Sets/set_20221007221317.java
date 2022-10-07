package Tutorials.Sets;

import java.util.HashSet;
import java.util.Set;

public class set {
    public static void main(String[] args) {
        System.out.println("Here we will learn about the sets :");
        // sets only have unique values //
        Set<String> set = new HashSet<String>();
        set.add("Shahnawaz");
        set.add("Hamza");
        set.add("Rahul");
        set.add("Ashish");
        set.add("Ashish");

        // System.out.println(set);
        for(String n : set){
            System.out.println(n);
        }
        System.out.println(set.contains(1)); // 1 is not present in the set.
    }
}
