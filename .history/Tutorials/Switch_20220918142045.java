package Tutorials;

public class Switch {
    public static void main(String[] args) {

        // As we cant use the if statement again an again , so we use another statement - switch 
        int g  = 2;  // We ccn t use float //
        switch (g) {
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Hi");
            break;
            case 3: System.out.println("good");
            break;
            default: System.out.println("Are yaar");
            break;

        }

        char fg= 'd';

        switch(fg) {
            case 'a': System.out.println("Hello there");
            case 'b': System.out.println("Hey");
            case 'c': System.out.println("Eh !");
            case 'd': System.out.println("see yah");

        }
        // System.out.println();
    }
}
