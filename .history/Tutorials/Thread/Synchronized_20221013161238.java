package Tutorials.Thread;

class Brackets { // Our class //

  private Object lock = "lock"; //  
  private String threadCode;
  Brackets(String threadCode) {
   this.threadCode = threadCode;
  }
  // Either write synchronized public void block() // 

  public void block() { // If we want to make the threads synchronized , then write synchronized //
    // Here the time required for execution will increase //
    // Monitor lock //
    // Can do this as well //
    // Synchronized block on a method - 

    synchronized (lock) {
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
}


public class Synchronized {

  public static void main(String[] args) {
    // Synchronized block on a object - 

    Brackets brack = new Brackets();
    Brackets brack2 = new Brackets();
    // brack.block();  // This will print the pattern //

    new Thread( // Thread - 1 -
      new Runnable() {
        public void run() {
          long startTime = System.currentTimeMillis();
          for (int i = 0; i <= 5; i++) {
            brack.block();
          }
          long endTime = System.currentTimeMillis();
          System.out.println("" + (endTime - startTime));
        }
      }
    )
      .start();
    new Thread(
      new Runnable() {
        public void run() {
          long startTime = System.currentTimeMillis();
          for (int i = 0; i <= 5; i++) {
            brack.block();
          }
          long endTime = System.currentTimeMillis();
          System.out.println("" + (endTime - startTime));
        }
      }
    ).start();
  }
  // The execution of both the threads depends on the hardware //
  // If there will be two different objects then also the execution will be affected , as they would be nullified //
}
