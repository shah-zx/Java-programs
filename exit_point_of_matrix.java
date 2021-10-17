
import java.util.Scanner;

public class exit_point_of_matrix {
    public static void main(String[] args) {
        System.out.println("Here we will see the exit point of the matrix :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Initially keeping the direction as 0 //

        int dir = 0;
        int i = 0; // Initially rows are 0 //
        int j = 0;  // Initially columns are 0 //

        // This is the code when we are inside our box traversing the elements //
        while (true) {
            dir = (dir + arr[i][j]) % 4;
            if (dir == 0) {
                j++;
            } else if (dir == 1) {
                i++;
            } else if (dir == 2) {
                j--;
            } else if (dir == 3) {
                i--;
            }

            // This will be the code when we want to know if we are outside our box //
            if(i<0) {
              i++;
              break;
            }
            else if(j<0) {
              j++;
              break;
            }
            else if(arr.length < 0)
            {
              i--;
              break;              
            }
            else if(arr[0].length < 0)
            {
              j--;
              break; 
            }
        }
        System.out.println(i);
        System.out.println(j);
        System.out.println(sc);
    }
}
