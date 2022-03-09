package programs;

import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        // We have class of 10 students
        int marks[] = new int[10];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }
        for (int j = 0; j < marks.length; j++) {
            System.out.println(marks[j]);
        }
    }

}
