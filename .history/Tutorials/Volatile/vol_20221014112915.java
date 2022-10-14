package Tutorials.Volatile;

public class vol {
    public static int flag = 0;
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    if(flag == 0){
                    System.out.println("Running");
                    }
                }
            }
        })
    }
}
