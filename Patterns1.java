import java.util.Scanner;

public class Patterns1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the number.");
        int num = scn.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
