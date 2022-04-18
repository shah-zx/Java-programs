package programs;

import java.util.*;

public class loops {

    public static void main(String[] args) {
        // System.out.println();
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int t;
        while (t != 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            for (int i = 0; i <= n - 1; i++) {
                sum += (a + Math.pow(2, i) * b);
            }
            System.out.println(sum);
        }
    }
}
