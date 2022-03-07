package Hackerrank;
import java.util.Scanner;


public class inttostring {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        String str = String.valueOf(y);
        if((Object) str.getClass().getSimpleName() == 'String'){
            System.out.println("Good job");
        }
    }
}
