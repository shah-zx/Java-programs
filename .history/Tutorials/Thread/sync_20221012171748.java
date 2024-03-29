package Tutorials.Thread;

// Here w will learn about the synchronization under concurrency

public class sync {

  public static int counter = 0;

  public static void main(String[] args) {
    Thread thread = new Thread(
      new Runnable() {
        @Override
        public void run() {
          for (int i = 0; i <= 9; i++) {
            sync.counter++;
          }
        }
      }
    );
    thread.start();
    System.out.println(counter);
  }
}
