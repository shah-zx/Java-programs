package Tutorials.Volatile;
class Bank {
   public static int balance = 0;
   public static void withdraw(int amount){
    if(balance <= 0){
        try {
            wait();
        } catch (Exception e) {
        }
    }
   }
}
public class waiiandnotify {
    public static void main(String[] args) {
        
    }
}