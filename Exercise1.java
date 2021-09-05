

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the percentage calculator :");
        System.out.println("Enter the marks of first subject :");
        int a = s.nextInt();
        System.out.println("Enter the marks of second subject :");
        int b = s.nextInt();
        System.out.println("Enter the marks of third subject :");
        int c = s.nextInt();
        System.out.println("Enter the marks of fourth subject :");
        int d = s.nextInt();
        System.out.println("Enter the marks of fifth subject :");
        int e = s.nextInt();
        System.out.println("Enter the maximum marks :");
        int f = s.nextInt();
        int add = a + b + c + d + e;
        int sub = 5;
        System.out.println("The total of your marks is :");
        System.out.println(add);
        float percent = add / sub;
        System.out.println("Your percentage is:");
        System.out.println(percent);

    }
}
