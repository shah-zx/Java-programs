package Hackerrank;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        if (f % 2 == 1) {
            System.out.println("Wierd");
        } else if (f % 2 == 0 && (f <= 2 && f >= 5)) {
            System.out.println("Not Weird");
        } else if (f % 2 == 0 && (f <= 6 && f >= 20)) {
            System.out.println("Not Weird");
        }
        else if(f % 2 == 0 && f > 20)
    }
}
