package Tutorials.Thread;

class Brackets {  // Our class // 

  synchronized public void block() {  // If we want to make the threads synchronized , then write synchronized //
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
    Brackets brack2 = new Brackets();
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
          brack2.block();
        }
      }
    }).start();;
  }

  // The execution of both the threads depends on the hardware //
}
