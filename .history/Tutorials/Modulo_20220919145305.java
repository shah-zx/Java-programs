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
    }
}
