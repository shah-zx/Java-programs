import java.util.*;

public class Inputs {
    public static void main(String[] args) {
        // Here we will be taking the inputs from the user ///
        System.out.println("Please enter the number of your choice");
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());
        String name = scn.nextLine();

        System.out.println("Dear " + name + " your counting is here...");
        // String name = scn.nextString();

        for (int d = 0; d <= n; d++) {
            System.out.println(d);
        }

    }
}
