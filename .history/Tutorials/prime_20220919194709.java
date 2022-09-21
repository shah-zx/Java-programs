package Tutorials;

public class prime {

  public static void main(String[] args) {

    int f = 25;
    
  }

  public static boolean isPrime(int w){
    int sum = 0;
    for (int i = 1; i <= w; i++) {
      if (w % i == 0) {
        sum+=1;
        // System.out.println(sum);
      }
    }
    if (sum == 2) {
      return true;
    } else {
      return false;
    }
  }
}
