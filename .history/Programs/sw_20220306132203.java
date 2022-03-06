package programs;

import java.util.Scanner;

public class sw {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        switch (d) {
            case 18:
                System.out.println("Hello adult");
                break;
            case 12:
                System.out.println("whatsup doe");
                break;
            case 10:
                System.out.println("Hello niga");
                break;
            case 11:
                System.out.println("Hello nibbe");
                break;
            case 20:
                System.out.println("hehe boi");
                break;
            default:
                System.out.println("re bhaiyya");
        }
    }
}

