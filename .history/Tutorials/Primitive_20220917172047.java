package Tutorials;

import java.math.BigDecimal;

public class Primitive {
    public static void main(String[] args) {
        int h = 34;  // Premeitive data type 
        System.out.println(h);

        // Max ranges of int  - 

        int max = 2147483647;
        int min = -2147483648;
        short g = 32767;
        short k = -32768;
        long longMax = Long.MAX_VALUE;  // 9223372036854775807
        long longMin = Long.MIN_VALUE;  // -9223372036854775808
        byte j = 127;
        byte v = -127;
        double s = 9d/2d;
        float i = 9f/2f;
        System.out.println("double is: "+ s );
        System.out.println("float is: "+ i );
        System.out.println("byte is: "+ j );  
        int marker = 200;
        double percentage = marker * 0.46f;  // As the f stands for float entity 
        System.out.println(percentage);
        boolean bar = true;
        char y = 'p';

        // For Ultra Precision  - 

        // Big Decimal -  
        BigDecimal decimal = new BigDecimal("1.05");
        BigDecimal decimal2 = new BigDecimal("2.33");
        System.out.println(decimal.add(decimal2));
        String g1 = "Hello World \u00BB";  // unicode 
        System.out.println(g1);
    }
}
