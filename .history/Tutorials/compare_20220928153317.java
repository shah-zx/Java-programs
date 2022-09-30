package Tutorials;
public class compare {
    public static void main(String[] args) {
        int result;
        List<String> countries = new LinkedList<>();
        countries.add("a");
        result = countries.compareTo("a");
        System.out.println(result);
    }
}
