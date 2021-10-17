// import java.util.Scanner;

// public class Primenumhighlow {
//     public static void main(String[] args) {
//         System.out.println("Program to print prime numbers from a given value to a last value.");
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the lower value");
//         int low = sc.nextInt();
//         System.out.println("Enter the upper value");
//         int high = sc.nextInt();
//         for (int n = low; low <= high; low++) {
//             int count = 0;
//             for (int div = 2; div * div <= n; div++) {
//                 if (n % div == 0) {
//                     count++;
//                     break;
//                 }
//             }
//             if (count == 0) {
//                 System.out.println("No prime numbers");
//             } else {
//                 System.out.println(n);
//             }
//         }
//     }
// }
