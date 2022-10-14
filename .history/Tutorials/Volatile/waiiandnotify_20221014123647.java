package Tutorials.Volatile;

class Bank {

  public static int balance = 0;

  public void withdraw(int amount) {
    synchronized (this) {
      if (balance <= 0) {
        try {
          System.out.println("Waiting for balance updation");
          wait(4000);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    }
    balance = balance - amount;
    System.out.println("Withdrawal Successful");
  }

  public void deposit(int amount) {
    System.out.println("We are depositing the amount");
    balance = balance + amount;
    synchronized (this) {
        notify();
    }
  }
}

public class waiiandnotify {

  public static void main(String[] args) {
    Bank sbi = new Bank();
    Thread thread1 = new Thread(
      new Runnable() {
        @Override
        public void run() {
          sbi.withdraw(1000);
        }
      }
    );
    thread1.start();
    Thread thread2 = new Thread(
      new Runnable() {
        @Override
        public void run() {
          sbi.deposit(2000);
        }
      }
    );
    thread2.start();
  }
}
