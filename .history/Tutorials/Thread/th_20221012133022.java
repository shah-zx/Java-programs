package Tutorials.Thread;


// Another class which is extending the thread class 

class MyCounter extends Thread {

  private int threadNo;

  public MyCounter(int threadNo) {
    this.threadNo = threadNo; // The thread number //
  }

  public void countMe() {
    for (int i = 0; i <= 9; i++) {
      try {
        sleep(2000);
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
    MyCounter count = new MyCounter(1);
    MyCounter count2 = new MyCounter(2);

    count.countMe();
    long StartTime = System.currentTimeMillis();
    System.out.println("--------------------");
  }
}
