package Tutorials;

public class For {

  public static void main(String[] args) {
    System.out.println();

    // Increasing loop
    for (int i = 0; i < 10; i++) {
      System.out.println(i);
    }

    // decreasing loop //
    int p = 20;
    for (; p >= 0; p--) {
      if (p <= 2) {
        break;
      } else {
        System.out.println(p);
      }
    }
  }
}
