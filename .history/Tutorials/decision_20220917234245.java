package Tutorials;

public class decision {
    public static void main(String[] args) {
        System.out.println();
        int d = 19;
        if(d == 9){  
        
        // Territory for this if statement  - 

            System.out.println("Value is 9");
        } else if(d < 9){
            System.out.println("Value is less than 9");
        } else {
            System.out.println("Value greater than 9");
        }
        int f = 4;
        int g = 5;
        if( f < g){
            System.out.println("Hello there");
        } else {
            System.out.println("Bye");
        }
        

        boolean x = true;
        boolean y = false;
        if(x && y){   // and  operator 
            System.out.println("False");
        } else {
            System.out.println("True");
        }

        if(x || y){   // or operator   - unary operator
            System.out.println("False");
        } else {
            System.out.println("True");
        }

        int l = 89;
        int c = 67;
        if(l < c && l != c){
            System.out.println("Nah");
        } else {
            System.out.println("Hah");
        }

        // Ternary operator - 

        boolean s = (5>4)?true:false;
        System.out.println(s);


        // Assignment operators - 

        int m = 12;
        m += 10;
        m-= 3;
        m*=2;
        System.out.println(m);

    }
}
