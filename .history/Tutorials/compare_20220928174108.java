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
    }
}
