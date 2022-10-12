package Tutorials.Thread;

// Here w will learn about the synchronization under concurrency

public class sync {

  public static int counter = 0;
  public static int counter2 = 0;
  public static void main(String[] args) throws InterruptedException {
    Thread thread = new Thread(
      new Runnable() {
        @Override
        public void run() {
          for (int i = 1; i <= 9; i++) {
            sync.counter++;
          }
          System.out.println("The loop of thread 1 is over");
        }
      }
    );
    Thread thread2 = new Thread(new Runnable() {

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
              counter2++;
            }
          System.out.println("The loop of thread 1 is over");

        }
    });

    thread.run();
    thread2.run();
    Thread.sleep(1000);

    System.out.println(counter2);
    System.out.println(counter);
  }
}
