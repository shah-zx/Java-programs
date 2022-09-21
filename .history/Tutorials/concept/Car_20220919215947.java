package Tutorials.concept;

public class Car {

    // Attributes -  

    private String name;
    private String type;
    private int doors;
    private int persons;
    private int sp;

    public void setSpeed(int speed) {
        sp = speed;
    }
    public int getSpeed() {
        System.out.println("The speed of the car is : ");
        return sp;
    }
    public void setDoors(){
        System.out.println("The doors are open");
    }
}
