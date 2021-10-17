import java.util.Scanner;

public class readline {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println(sc);
        System.out.println("Please enter a string :- ");
        String a = sc.nextLine();
        System.out.println("Please enter a number :-");
        int b = sc.nextInt();
        System.out.println("This is the string: " + a);
        System.out.println("This is the number: " + b);

    }
}

