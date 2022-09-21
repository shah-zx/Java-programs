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

        if(x || y){   // or operator 
            System.out.println("False");
        } else {
            System.out.println("True");
        }

        int g = 89;
        int c = 67;
        if(g < c && g != c){
            System.out.println("Nah");
        } else {
            System.out.println("Hah");
        }
    }
}
