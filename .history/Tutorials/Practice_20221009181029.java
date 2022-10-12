package Tutorials;
public class Practice {
    public static void main(String[] args) {
        
        System.out.println("Here we will do some practice");
        int d = 10;
        int g = 80;
        // If else loop - 

        if(g > d){
            System.out.println("g is greater than d");
        } else {
            System.out.println("d is greater than g");
        }

        // for loop - 

        for(int i = 10; i > 0; i--){
            System.out.println(i);
        }

        // While loop - 

        int f = 15;
        while(f!=0){
            System.out.println(f);
        }

        char s = 'a';
        switch (s) {
            case 'a':
                System.out.println("Hello there , a is here");
                break;
            case 'b':
                System.out.println("Hello there , b is here");
                break;
            default:
                break;
        }
    }
}
