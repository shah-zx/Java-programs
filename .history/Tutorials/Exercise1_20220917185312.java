package Tutorials;

public class Exercise1 {
    public static void main(String[] args) {
        int a = 7;
        float s = 4.5f;
        int g = (int) ((a*a) + (2 * a * s) + (s * s));  // Explicitly type casting to int 
        System.out.println(g);
    }
}
