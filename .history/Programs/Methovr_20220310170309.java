package programs;

import java.util.Scanner;

public class Methovr {

   // Here we are having two methods with the same name but the parametres are different 

    static int Add(int a, int b) {
        return a + b;
    }

    static int Add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();
        int y = scanner.nextInt();
        int c = scanner.nextInt();
        // int g = Add(f, y,c);
        int j = Add(f, y , c);
        System.out.println(j);
    }
};
