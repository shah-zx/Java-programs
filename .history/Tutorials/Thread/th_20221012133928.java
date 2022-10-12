package Tutorials.Thread;


// Another class which is extending the thread class 

class MyCounter extends Thread {

  private int threadNo;

  public MyCounter(int threadNo) {
    this.threadNo = threadNo; // The thread number //
  }

  @Override
  public void run() {

  }

  public void countMe() {
    for (int i = 0; i <= 9; i++) {
      try {
        sleep(500);
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
    count.countMe();
    System.out.println("--------------------");
    count.countMe();
    long EndTime = System.currentTimeMillis();
    System.out.println("Total time required : " + EndTime + StartTime);

  }
}
