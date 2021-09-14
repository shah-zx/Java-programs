
class myThread extends Thread {
    public void run() {
        int j = 0;
        while (j<20) {
            System.out.println("Hey my thread is running");
            System.out.println("Its a good feeling!");
            j++;
        }
    }
}

class myThread2 extends Thread {
    public void run() {
        int p = 0;
        while (p<20) {
            System.out.println("Thread 2 is good");
            System.out.println("Hey my thread is running");
            p++;
        }
    }
}

public class multithreading {
    public static void main(String[] args) {

        System.out.println("Hey my thread is running");
        myThread t1 = new myThread();
        myThread t2 = new myThread();
        t1.start(); // For starting thread
        t2.start(); // For starting thread

        // These funcrions will be running parallely with each other. //

        // funct1(); --> th
        // funct2(); --> th

    }
}
