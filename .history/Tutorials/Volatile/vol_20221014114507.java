package Tutorials.Volatile;

public class vol {

  public static int flag = 0; // A variable //
  // Thread is dependent on a variable //
  public static void main(String[] args) {
    new Thread(
      new Runnable() {
        @Override
        public void run() {
          while (true) {
            if (flag == 0) {
              System.out.println("Running");
            } else {
              break;
            }
          }
        }
      }
    ).start();
    new Thread(  // Second thread // 
      new Runnable() {
        @Override
        public void run() {
          try {
            Thread.sleep(1000);
          } catch (Exception e) {
            e.printStackTrace();
          }
          vol.flag = 1;
          System.out.println("Value Updated");
        }
      }
    ).start();;
  }
}
