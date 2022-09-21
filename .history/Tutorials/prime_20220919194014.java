package Tutorials;

public class prime {

  public static void main(String[] args) {
    int f = 7;
    int sum = 0;
    for (int i = 1; i <= f; i++) {
      if (f % i == 0) {
        sum+=1;
        // System.out.println(sum);
      }
    }
    if (sum == 2) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
