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
            // break;

        }

        char fg= 'd';
  // We can also use capital letters 
        switch(fg) {
            case 'a': System.out.println("Hello there");
            break;
            case 'b': System.out.println("Hey");
            break;
            case 'c': System.out.println("Eh !");
            break;
            case 'd': System.out.println("see yah");

        }
        // System.out.println();

        // Can aslo use the strings -

        String name = "Shahnawaz";
        switch(name){
            case "Shahnawaz":
            System.out.println("Hello " + name);
            break;
            case "Hamza":
            System.out.println("Hello hamza");
            break;
        }
    }
}
