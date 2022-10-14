package Tutorials.Volatile;

public class vol {
    public static int flag = 0; // A variable //
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    if(flag == 0){
                    System.out.println("Running");
                    } else {
                        break;
                    }
                }
            }
        }).start();;
        new Thread (new Runnable() {
            @Override
            public void run() {
             try {
                Thread.sleep(100);
             } catch (Exception e) {
                e.printStackTrace();
             }
            }
        });
    }
}
