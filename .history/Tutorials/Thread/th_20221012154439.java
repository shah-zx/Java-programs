package Tutorials.Thread;


// Another class which is extending the thread class 

class MyCounter extends Thread {

  private int threadNo;

  public MyCounter(int threadNo) {
    this.threadNo = threadNo; // The thread number //
  }

  @Override
  public void run() {
    countMe();
  }

  public void countMe() {
    for (int i = 0; i <= 9; i++) {
      try {
        sleep(10);
      } catch (Exception e) {
        e.printStackTrace();
      }
      System.out.println(
        "The value of i is " + i + "and the thread number is :" + threadNo
      );
    }
  }
}

public class th{
  public static void main(String[] args) {
    long StartTime = System.currentTimeMillis();
    MyCounter count = new MyCounter(1);
    MyCounter count2 = new MyCounter(2);
    count.start();  // Causes this thread to begin execution; the Java Virtual Machine calls the run method of this thread.
    System.out.println("--------------------");
    long EndTime = System.currentTimeMillis();
    long result = EndTime - StartTime;
    double ans = (result/1000)%60;
    System.out.println("Total time required : " + ans +" seconds"); 
  }
}
