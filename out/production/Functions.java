package out.production;

import java.util.Scanner;

public class Functions {

    public static int factorial(int x) {
        int rv = 1;
        for (int i = 1; i <= x; i++) {
            rv *= i;
        }
        return rv;
    }

    public static void main(String[] args) {

        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        System.out.println("enter r");
        int r = sc.nextInt();
        int fact = factorial(n) / factorial(n - r);
        System.out.println(fact);

    }
}

