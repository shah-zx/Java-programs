package Tutorials;

public class While{
    public static void main(String[] args) {
        System.out.println("");
        int y = 10;
        int i = 0;
        while (y != 0) {
            System.out.println("Thsi is the while loop");
            System.out.println("Hello");
            y--;
        }
        do{
            System.out.println("Hello");
            i++;
        }while (y != 0);
        for(int l = 0 , m = 0; l <= 10 && m <= 10; l++ , m++){
           System.out.println("This is i "+ l);
           System.out.println("This is j"+ m);
        }
        int b = 10;
        int x = 10;
        do{
            b++;
            x++;
            System.out.println("Hello "+ b);
            System.out.println("Hello "+ x);
        }while(b>0 || x>0);


        // Break and continue - 

        for(int q = 0; q<10;q++){
              System.out.println(q);
        }
    }
}
