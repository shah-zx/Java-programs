package Tutorials.Veihicle;

public class Truck {
    private int gears;
    private int speed;
    private int passengers;
    public String enGine(int gears , int speed){
          if(gears == 7 && speed == 220){
            return "Truck ready to run";
          } else {
            return "Not ready";
          }
    }
}
