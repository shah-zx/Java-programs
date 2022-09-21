package Tutorials.Veihical;

// Here our bike class is inheriting the vehical class //

public class Bike extends Vehical {
    
    public int speed;
    public int gears;
    public int passengers;
    public String enGine(int speed, int gears) {
           if(speed == 120 && gears == 6){
            return "Bike ready to run";
           } else {
            return "Not ready";
           }
    }
}
