package Hackerrank;
import java.util.Scanner;


public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(g + "x" + i + "=" + g *i);
        }
    }
}
