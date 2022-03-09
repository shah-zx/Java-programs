package programs;
import java.util.Scanner;



public class overloadmeth {
    static int Logic(int g, int k) {
        int u = g + k;
        return u;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    
        int o = scanner.nextInt();
        int p = scanner.nextInt();
        System.out.println(Logic(o,p));
        
        // System.out.println("shahnawaz");

    }
}
