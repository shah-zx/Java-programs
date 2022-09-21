package Tutorials;

public class Methods {
    public static void main(String[] args) {
        int f =12;
        int x = 34;
        int r = area(f,x);
        System.out.println(r);

    }
    public static void loop1(int m)  {
        for(int i = 0; i <= m; i++){
            System.out.println(i);
        }
    }

    // Methods parameteres and return value -
    
    public static int area(int a , int b) {
            
            return a + b;
    }

    // Method Overloading - 
}
