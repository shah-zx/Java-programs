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
  }
}

public class Synchronized {}
