package Tutorials.Veihical;

public class Bike {
    public int speed;
    public int gears;
    public int passengers;
    public String Engine(int speed, int gears) {
           if(speed == 120 && gears == 6){
            return "Bike ready to run";
           }
    }
}
