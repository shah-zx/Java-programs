package Tutorials.Thread;

class Brackets { // Our class //

  private static Object lock = "lock"; //  
  private static String threadCode;

  Brackets(String threadCode) { // Parameterized constructor //
   this.threadCode = threadCode;
  }
  // Either write synchronized public void block() // 

  synchronized static public void block() { // Using static // 

    // If we want to make the threads synchronized , then write synchronized //
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
      System.out.println("This is generated by: " + threadCode);
    }
  }
}

public class Synchronized {

  public static void main(String[] args) {
    // Synchronized block on a object - 

    Brackets brack = new Brackets("Shahnawaz");
    Brackets brack2 = new Brackets("Hamza");
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
    ).start();
    new Thread(  // Thread - 2 -  
      new Runnable() {
        public void run() {
          long startTime = System.currentTimeMillis();
          for (int i = 0; i <= 5; i++) {
            brack2.block();
          }
          long endTime = System.currentTimeMillis();
          System.out.println("The time taken is: " + (endTime - startTime));
        }
      }
    ).start();
  }
  // The execution of both the threads depends on the hardware //
  // If there will be two different objects then also the execution will be affected , as they would be nullified //
  // Synchronization is the potential to regulate the access of multiple threads to any shared resource. Synchronization in Java is essential for reliable communication between threads. It is achieved in Java with the use of synchronized keywords.Important Points Regarding Synchronization It is only for methods that are at the Object level.If a method or block is synchronized, then it requires an object-level lock to start execution.Synchronization is the most dangerous word in java because this is the only reason for the deadlock.Use synchronized keywords when it is required and try to use synchronized block. //
}
