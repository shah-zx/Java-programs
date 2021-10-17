package Arrays;

import java.util.*;

public class decimal_to_octal {
    // Java program to convert a decimal
    // number to octal number

    // Function to convert decimal to octal
    static void decToOctal(int n) {
        // array to store octal number
        int[] octalNum = new int[100];

        // counter for octal number array
        int i = 0;
        while (n != 0) {
            // storing remainder in octal array
            octalNum[i] = n % 8; 
            n = n / 8;  // dividing the remainder once again //
            i++;
        }

        // Printing octal number array in reverse order //
        for (int j = i - 1; j >= 0; j--)
            System.out.print(octalNum[j]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        System.out.println(sc);
        // Function Call
        decToOctal(n);
    }

}

