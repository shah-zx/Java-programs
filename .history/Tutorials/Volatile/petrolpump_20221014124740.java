package Tutorials.Volatile;


class Pump {
    static public int petrol = 0; // The current litres of fuel in the vehicle
    public void  fill(int capacity){
        capacity =  capacity + petrol;
    }
}


public class petrolpump {
    public static void main(String[] args) {
        
    }
}