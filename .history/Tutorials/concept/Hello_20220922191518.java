package Tutorials.concept;
import Tutorials.concept.Person;
public class Hello {

  public static void main(String[] args) {
    Car car = new Car("BMW", "sedan", 4, 0, 0);
    car.setSpeed(100);
    System.out.println(car.getSpeed());   // This gives us the speed of the car
    System.out.print(
      car.runCar(4, 2)
    ); 
    Person person = new Person(null, null, 0);
  }
}
