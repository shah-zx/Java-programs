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
        String es = "Hamza";
        System.out.println(ws.compareTo(es));
        // If part 1 and part 2 are same then the result is 0;
        // If the part 1 is greater then the result is 1;
        // If the part 2 is smaller then -1 
    }
}
