package Tutorials;

import java.util.LinkedList;
import java.util.List;

public class compare {
    public static void main(String[] args) {
        int result;
        List<String> countries = new LinkedList<>();
        countries.add("a");
        result = countries.get(0).compareTo("a");
        System.out.println(result);
        String ws = "Shahnawaz";
        String es = "Shahnawaz";
        System.out.println(ws.compareTo(es));
        // If part 1 and part 2 are same then the result is 0;
        // If the part 1 is greater then the result is 1;
        // If the part 2 is smaller then -1 


        // Comparable Interface Implementation - 

        // Java Comparable interface is used to order the objects of the user-defined class. This interface is found in java.lang package and contains only one method named compareTo(Object). It provides a single sorting sequence only, i.e., you can sort the elements on the basis of single data member only. For example, it may be rollno, name, age or anything else.

        
    }
}
