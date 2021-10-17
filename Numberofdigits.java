import java.util.Scanner;

public class Numberofdigits {
    public static void main(String[] args) {
        System.out.println("Plaese enter the number");
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        int nod = 0;
        int temp = e;
        while (temp != 0) {
            temp = temp / 10;
            nod++;
        }
        int div = (int) Math.pow(10, nod - 1);
        while (div != 0) {
            int q = div / e;
            System.out.println(q);
            e = e % div;
            div = div / 10;
        }
        System.out.println(sc);
    }
}
