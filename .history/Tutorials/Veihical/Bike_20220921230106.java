package Tutorials.Veihical;

// Here our bike class is inheriting the vehical class //

public class Bike extends Vehical {
    
    public int speed;
    public int gears;
    public int passengers;
    public Bike() {
        super();
        // this.speed = 100;
    }
    public String toString() {
        return "Bike";
    }
    public Bike(int speed , int gears , int passengers) {
      this.speed = speed;
      this.gears = gears;
      this.passengers = passengers;
        // this.speed = 100;
    }
    public String enGine(int speed, int gears) {
           if(speed == 120 && gears == 6){
            return "Bike ready to run";
           } else {
            return "Not ready";
           }
    }
    public void run(){
        System.out.println("Vehicle is running");
        System.out.println(toString());
    }
}