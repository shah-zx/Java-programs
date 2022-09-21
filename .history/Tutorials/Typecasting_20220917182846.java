package Tutorials;

public class Typecasting {
    public static void main(String[] args) {

        // Implicit type casting -  used when weidening is done 

        // byte - short - int - long - float - double 

        short f = 200;
        int x = f;
        System.out.println(x);

        // Explicit type casting - used when narrowing is done 

        // double - float - long - int - short - byte 

        int g = 90;
        short r = (byte)g;
        System.out.println(r);

        float fd = 12.0f;
        double hg = fd;
        System.out.println(hg);

        int a = 23;
        float b = a;
        System.out.println(b);

    }
}
