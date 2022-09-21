package Tutorials.concept;

public class Car {

  // Attributes -

  private String name;
  private String type;
  private int doors;
  private int ps;
  private int sp;


  public String runCar(int doors , int ps){
    if(doors == 4 && ps == 2){
      return "Start the engine mann";
    }
  }
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
  public int getPersons() {
    return ps;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getDoors() {
    return doors;
  }

  public void setDoors(int doors) {
    this.doors = doors;
  }

  public int getPs() {
    return ps;
  }

  public void setPs(int ps) {
    this.ps = ps;
  }

  public int getSp() {
    return sp;
  }

  public void setSp(int sp) {
    this.sp = sp;
  }
}
