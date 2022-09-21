package Tutorials.concept;

public class Car {

  // Attributes -

  private String name;
  private String type;
  private int doors;
  private int ps;
  private int sp;

  public void setSpeed(int speed) {
    sp = speed;
  }

  public int getSpeed() {
    System.out.println("The speed of the car is : ");
    return sp;
  }

  public void openDoors() {
    System.out.println("The doors are open");
  }

  public void closeDoors() {
    System.out.println("The doors are closed");
  }
  public void setPersons(int persons) {
    ps = persons;
    System.out.println("4 persons are allowed");
  }
  public void getPersons() {

  }
}
