package Tutorials.Thread;

class Brackets {

  public void block() {
    for (int i = 0; i <= 10; i++) {
      if (i < 5) {
        System.out.print("{");
      } else {
        System.out.print("}");
      }
    }
    System.out.println();
  }
}

public class Synchronized {
 public static void main(String[] args) {
    Brackets brack = new Brackets();
    brack.block();  // This will print the pattern //
 }
}

