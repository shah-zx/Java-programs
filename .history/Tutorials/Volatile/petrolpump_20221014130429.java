package Tutorials.Volatile;


class Pump {
    static public int petrol = 0; // The current litres of fuel in the vehicle
    public int capacity; 
    public void  fill(int capacity){
        capacity =  capacity + petrol;
    }
    public void checkCapacity(){
        if(capacity < 40){
        try {
            System.out.println("Fuel is low , right now :" + capacity); 
            wait();
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
        else {
            System.out.println("Fuel is enough , right now" + capacity);
        }
    }
}


public class petrolpump {
    public static void main(String[] args) {
        Pump indianoil = new Pump();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
               indianoil.checkCapacity();
            }
        });
        thread1.start();
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                indianoil.fill(70);
            }
        });
        thread2.start();
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                 indianoil.checkCapacity();
            }
        });
        thread3.start();
    }
}
