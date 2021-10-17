import java.util.Scanner;

public class Matrixmultiplication {
    public static void main(String[] args) {
        System.out.println("Here we will do the multiplication of two matrices");
        /* Taking the input for first matrice */
        Scanner sc = new Scanner(System.in);
        System.out.println(sc);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int one[][] = new int[r1][c1];
        for (int i = 0; i < one.length; i++) {
            for (int j = 0; j < one[0].length; j++) {
                one[i][j] = sc.nextInt();
            }
        }
        /* Taking the input for second matrice */
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int two[][] = new int[r2][c2];
        for (int i = 0; i < two.length; i++) {
            for (int j = 0; j < two[0].length; j++) {
                two[i][j] = sc.nextInt();
            }
        }
        /* Checking the condition for mutliplication of the two matrices */
        if (c1 != r2) {
            System.out.println("Invalid input");
        }
        /* Placing the multiplied values into the product matrice */

        int prd[][] = new int[r1][c2];
        for (int i = 0; i < prd.length; i++) {
            for (int j = 0; j < prd[0].length; j++) {
                for (int k = 0; k < c1; k++) {
                    prd[i][j] += one[i][k] * two[k][j];
                }
            }
        }

        /* Displaying the product matrice */
        
      for (int i = 0; i < prd.length; i++) {
          for (int j = 0; j < prd[0].length; j++) {
              System.out.print(prd[i][j] + " ");
          }
          System.out.println(" ");
      }
    }
}
