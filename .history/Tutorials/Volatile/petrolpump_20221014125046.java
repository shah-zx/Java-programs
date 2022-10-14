package Tutorials.Volatile;


class Pump {
    static public int petrol = 0; // The current litres of fuel in the vehicle
    public void  fill(int capacity){
        capacity =  capacity + petrol;
    }
    public void checkCapacity(int capacity){
        if(capacity < 40){
        try {
            System.out.println("Fuel is low");
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
        else {
            System.out.println("Fuel is full");
        }
    }

}


public class petrolpump {
    public static void main(String[] args) {
        
    }
}
