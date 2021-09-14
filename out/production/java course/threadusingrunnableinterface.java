
class myThreadrunnable1 implements Runnable {
    public void run() {
        int h = 0;
        while (h < 20) {
            System.out.println("I am a thread not a thread");
            h++;
        }
    }
}

class myThreadrunnable2 implements Runnable {
    public void run() {
        System.out.println("I am a thread not a thread number 2");
    }
}

public class threadusingrunnableinterface {
    public static void main(String[] args) {
        System.out.println();
        myThreadrunnable1 bullet1 = new myThreadrunnable1();
        Thread gun1 = new Thread(bullet1);

        myThreadrunnable2 bullet2 = new myThreadrunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
