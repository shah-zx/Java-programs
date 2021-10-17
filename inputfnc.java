
// Here we will learn how to take input form the user //
import java.util.Scanner;

public class inputfnc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   // Here Scanner is a class of java and we have made a new object from it using new keyword //
        System.out.println(sc);
        System.out.println("Enter number one :");
        float a = sc.nextFloat();
        System.out.println("Enter number two :");
        float b = sc.nextFloat();
        float sum = a+b;
        System.out.println("The sum of these numbers is :");;
        System.out.println(sum);



    }
}
