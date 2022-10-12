package Tutorials.Thread;

public class th extends Thread{

  private int threadNo;

  public void MyCounter(int threadNo) {
    this.threadNo = threadNo;  // The thread number //
  }

  public void countMe(){
    for(int i = 0; i <= 0; i++){
        System.out.println("The value of i is " + i + "and the thread number is :" + threadNo);
    }
  }
}
