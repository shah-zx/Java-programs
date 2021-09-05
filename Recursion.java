
// Here we will study about the recursion //
// A function calls itself is called recursion //

public class Recursion {

    static int factorial(int n) {
        // Here we will take the example of factorial //
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // The recursive approach //

    public static void main(String[] args) {
        System.out.println();

        // Calling the function in the main method //

        int a = 4;
        int f;
        f = factorial(a);
        System.out.println(f);

    }

}