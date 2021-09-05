

// Here we will learn about precedence of operators //
// which operator to execute first //
// Precedence and associativity //

public class Precedenceofoperators {
    public static void main(String[] args) {
        // int a = 6*5-34/2;
        /*
        = 30-34/2
        = 30-17
         = 13
        */
        // int b = 60/5-34*2;  // Here associaativity will work , which is left to right in case of / and * //
        // = 12 - 68
        // = -56 
        // System.out.println(a);
        // System.out.println(b);
        // Qick quiz //
        // int x = 6;
        // int y = 1;
        // int k = x * y/2;
        // System.out.println(k);

        int w = 1;
        int u = 4;
        int z = 5; 
        int k = w*w - (4*z*u)/(2*z);
        System.out.println(k);
        
    }
}
