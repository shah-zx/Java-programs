package programs;
import java.util.Scanner;


public class Methovr {

    static int Add(int a, int b) {
        return a + b;
    }
    static int Add(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();
        int y = scanner.nextInt();
        int g = Add(f,y)        
    }
}
;