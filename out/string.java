package out;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        System.out.println("Please enter the two strings :");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("This is our string " + s);
        System.out.println(sc);
        // String s = sc.next();
        // String p = sc.next();
        // System.out.println(s + p);
        // String e = "abcd";
        // System.out.println(e.substring(1, 3));
        // System.out.println(e.substring(0, 1));

        // // System.out.println(e.substring(3,7)); // hnaw
        // // System.out.println(e.substring(2,7)); // ahnaw
        // // Printing all the substring of the string abcd //

        // for (int i = 0; i < e.length(); i++) {
        // for (int j = i + 1; j <= e.length(); j++) {
        // System.out.println(e.substring(i, j)); // Here i and j are the substrings
        // with the help of indexes //
        // }
        // }

        // Adding two strings :

        String s1 = "Hello";
        String s2 = "world";
        s1 += 'd'; // We can also add characters to the string //
        String s3 = s1 + " " + s2;
        String p = "abc_def_ghi_jkl";  // This will make an array after spliting the string on _ //
        String[] parts = p.split("_");
        for (int i = 0; i < p.length(); i++) {
            System.out.println(parts[i]);
        }
        // System.out.println(s1 + 10 + 20); // Here the 10 and 20 will concatenate with hello as strings and not as
        //                                   // numbers //
        // System.out.println(10 + 20 + s1);
        System.out.println(s3);
    }
}

// a = 01
// ab = 02
// abc = 03
// abcd = 04
// b = 12
// bc = 13
// bcd = 14
// c = 2
// cd = 24
// d = 34
