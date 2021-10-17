
import java.util.Scanner;

public class state_of_wakanda {
    public static void main(String[] args) {
        System.out.println("Here we will traverse the matrice in a wave form.");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc);
        System.out.println();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int j = 0; j < arr[0].length; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int i = arr.length - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println(" ");
        }
    }
}
