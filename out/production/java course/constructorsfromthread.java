
class myThr extends Thread {
    public myThr(String name) {
        super(name);
    }

    public void run() {
        int i = 20;
        while (i<0) {
            System.out.println("Thread");
            i++;
        }

    }
}

public class constructorsfromthread {
    public static void main(String[] args) {
        System.out.println();
        myThr t1 = new myThr("shahnawaz");
        t1.start();
        System.out.println("The id of the thread t1 is " + t1.getId());
        System.out.println("The name of the thread t1 is " + t1.getName());

    }
}
