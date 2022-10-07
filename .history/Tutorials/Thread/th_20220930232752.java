package Tutorials.Thread;

public class th {

  private int threadNo;

  public void MyCounter(int threadNo) {
    this.threadNo = threadNo;
  }

  public void countMe(){
    for(int i = 0; i <= 0; i++){
        System.out.println("The value of i is " + i + "and the thread number is :" + threadNo);
    }
  }
}
