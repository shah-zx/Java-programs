package Arrays;

import java.util.Scanner;

public class spiral_of_arrays {
    public static void main(String[] args) {
        System.out.println("Here we will traverse the array in spiral fashion ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Now we will be traversing the array in a box shape //

        int minr = 0;
        int minc = 0;
        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;
        int tne = n * m; // This is for total number of elements in the array
        int cnt = 0; // To count the number of elements // Will act as a counter //

        // For left wall //
        for (int i = minr, j = minc; i <= maxr && cnt < tne; i++) {
            System.out.println(arr[i][j]);
            cnt++; // After every element in the array this counter will be increased //
        }
        minc++;
        // For bottom wall //
        for (int i = maxr, j = minc; i <= maxc && cnt < tne; i++) {
            System.out.println(arr[i][j]);
            cnt++;
        }
        maxr--;
        // For right wall //
        for (int i = maxc, j = maxr; i <= minr && cnt < tne; i++) {
            System.out.println(arr[i][j]);
            cnt++;
        }
        maxc--;
        // For top wall //
        for (int i = minr, j = maxc; i < minc && cnt < tne; i++) {  // cn < tne indicates that , the total number of elements are less than the count //
            System.out.println(arr[i][j]);
            cnt++;
        }
        minr++;
    }
}
