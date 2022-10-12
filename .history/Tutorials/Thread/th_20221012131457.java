package Tutorials.Thread;

public class th extends Thread{

  private int threadNo;

  public void MyCounter(int threadNo) {
    this.threadNo = threadNo;  // The thread number //
  }

  public void countMe(){
    for(int i = 0; i <= 9; i++){
      try {
        sleep(2000);
      } catch (Exception e) {
        
      }
        System.out.println("The value of i is " + i + "and the thread number is :" + threadNo);
    }
  }
}
