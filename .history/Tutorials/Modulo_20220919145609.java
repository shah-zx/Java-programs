package Tutorials;

public class Modulo {
    public static void main(String[] args) {
        System.out.println("");
        int g = 10;
        g %= 2;
        System.out.println(g);
        int h = 10;
        if(h % 2 == 0){
            System.out.println("The value is even");
        } else {
            System.out.println("The value is odd");
        }

        int w  = 1234;
        int sum = 0;
        while(w != 0){
            int ld = w % 10;
            sum += ld;
            w /= 10;
        }
    }
}
