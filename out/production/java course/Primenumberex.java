
import java.util.*;

public class Primenumberex {
    public static void main(String[] args) {
        System.out.println();

        // 1. You've to check whether a given number is prime or not.
        // 2. Take a number "t" as input representing count of input numbers to be
        // tested.
        // 3. Take a number "n" as input "t" number of times.
        // 4. For each input value of n, print "prime" if the number is prime and "not
        // prime" otherwise.
        // int num;

        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter a number");
        int t = scn.nextInt();
        System.out.println(scn);

        for (int i = 0; i < t; i++) {
            int n = scn.nextInt();

            int count = 0;
            for (int div = 1; div <= n; div++) {
                if (n % div == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("The number is prime.");
            } else {
                System.out.println("The number is not prime.");
            }
        }

        // 1. You've to print all prime numbers between a range.
        // 2. Take as input "low", the lower limit of range.
        // 3. Take as input "high", the higher limit of range.
        // 4. For the range print all the primes numbers between low and high (both
        // included).
        
            Scanner sc = new Scanner(System.in);
            System.out.println(sc);
            System.out.println("Enter the low limit of range");
            int low = sc.nextInt();
            System.out.println("Enter the high limit of range");
            int high = sc.nextInt();
            int count = 0;
            System.out.println(count);
            for (int l=1; low <= high; low++) {
                for (int div = 1; div <= high; div++) {
                    if (high % div == 0) {
                        count++;
                        System.out.println(l);
                    }
                }
            }


    }
}
