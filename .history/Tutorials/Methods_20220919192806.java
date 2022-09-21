package Tutorials;

public class Methods {

  public static void main(String[] args) {
    int f = 12;
    int x = 34;
    int r = area(f, x);
    System.out.println(r);
    int o = area(f,x,r);
    System.out.println(o);
  }

  public static void loop1(int m) {
    for (int i = 0; i <= m; i++) {
      System.out.println(i);
    }
  }

  // Methods parameteres and return value -

  public static int area(int a, int b) {
    return a + b;
  }

  // Method Overloading -

  public static int area(int a, int b, int c) {
    return a + b + c;
  }

  public static float area(int a, float d){
    return a + d;
  }
}
