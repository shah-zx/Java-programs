
// Here we will study about various methods in string //

public class stringsmethods {
    public static void main(String[] args) {
        String name = "shahnawaz";
        // System.out.println(name);
        // length , conversion to lower case etc //
        // System.out.println(name);
        int value = name.length(); // The length method //
        String ls = name.toLowerCase(); // The lowercase //
        String us = name.toUpperCase(); // The uppercase //
        String nontrimmedString = "   shanu    ";
        System.out.println(nontrimmedString.trim()); // The trim method //
        System.out.println(value);
        System.out.println(ls);
        System.out.println(us);
        System.out.println(name.substring(2));
        System.out.println(name.substring(0, 4));
        System.out.println(name.replace('n', 'h')); // To replace the character in the string //
        System.out.println(name.replace("sh", "hs")); // To replace the string in the string //
        System.out.println(name.startsWith("sha")); // To check wether the program is starting with the written string
                                                    // //
        System.out.println(name.endsWith("sha"));
        System.out.println(name.endsWith("waz"));
        System.out.println(name.charAt(3)); // To find out the character at the given index //
        System.out.println(name.indexOf("ha")); // This will return the index of the string we have given to it //
        String modified = "hamza sayyed";
        System.out.println(modified.indexOf("hamz"));
        System.out.println(modified.indexOf("ham", 3));
        System.out.println(modified.lastIndexOf("ah"));
    }
}
