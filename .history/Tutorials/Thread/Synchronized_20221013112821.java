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
    // brack.block();  // This will print the pattern //

    new Thread(  // Thread - 1 - 
      new Runnable() {
        public void run() {
          for (int i = 0; i <= 5; i++) {
            brack.block();
          }
        }
      }
    ).start();;

    new Thread(new Runnable() {
      public void run() {
        for (int i = 0; i <= 5; i++){
          brack.block();
        }
      }
    }).start();
  }
}
