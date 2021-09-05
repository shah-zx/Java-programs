import java.util.Scanner;

// Here we will learn about strings : strings are sequence of characters //
// Strings are immutable and cant be changed //
public class Strings {
    public static void main(String[] args) {
        System.out.println();
        //  String  : its a class in java //
        String name = new String("shahnawaz");  // We can  use the string this way also //
        // This way also //
        String n = "shahnawaz sayyed";
        System.out.println(name);
        System.out.println(n);
        // One more thing we can do for printing //
        int a = 6;
        float b = 5.4656f;
        System.out.printf("The value of a is %d and value of b is %.2f" , a , b); // %d , %f are format specifiers //
        System.out.printf("The value of a is %d and value of b is %6.2f" , a , b); // %d , %f are format specifiers // // 6.2f will take 6 places in the left //
        // System.out.format("The value of a is %d and the value of b is %f" , a , b);
        Scanner msc = new Scanner(System.in); 
        // String st = sc.next();  // For printing the first word of the input //
        String st = msc.nextLine();
        System.out.println(st);

        // String arrays //

        String arr[] = new String[3];
        arr[0] = "H";
        arr[1] = "e";
        arr[2] = "y";

        // Printing the string //

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
