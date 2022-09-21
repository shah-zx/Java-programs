package Tutorials;

public class prime {

  public static void main(String[] args) {
    int f = 5;
    int sum = 0;
    for (int i = 1; i <= f; i++) {
      if (sum % i == 0) {
        sum++;
      }
    }
    if (sum == 2) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
