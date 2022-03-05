package programs;

public class strings {
    public static void main(String[] args) {
        System.out.println();
        // sequence of characters

        String str = "shahnawaz";
        // System.out.println(str);
        // System.out.print(str); // This will not give any space after the line
        // int d = 90;
        // float f = 90.8343f;
        // String s1 = "Hello";
        // System.out.printf("%d , %f", d, f);
        // System.out.printf("%s", s1);

        // Methods in string

        // int g = str.length();
        // System.out.println(g); // length dega
        // str.toLowerCase();
        // System.out.println(str);
        System.out.println(str.toUpperCase());
        // System.out.println(str);
        String s = "shanu";
        System.out.println(s.trim());
        System.out.println(s.substring(3));
        System.out.println(s.substring(1, 4)); // start included and end excluded
        System.out.println(s.replace('s', 'a')); // This replaces the character
        System.out.println(s.replace("sha", "ahh")); // This replaces the character
        System.out.println(s.startsWith("Har"));

    }
}

// strings are immutable
