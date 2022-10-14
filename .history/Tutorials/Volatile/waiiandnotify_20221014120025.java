package Tutorials.Volatile;

class Bank {

  public static int balance = 0;

  public void withdraw(int amount) {
    if (balance <= 0) {
      try {
        System.out.println("Waiting for balance updation");
        wait();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    balance = balance - amount;
    System.out.println("Withdrawal Successful");
  }
  public void deposit(int amount) {
     balance = balance + amount;
  }
}

public class waiiandnotify {

  public static void main(String[] args) {}
}
