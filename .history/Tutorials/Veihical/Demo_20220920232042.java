package Tutorials.Veihical;

public class Demo {
    public static void main(String[] args) {
        Bike apache = new Bike();
        apache.gears = 6;
        apache.passengers = 2;
        apache.speed = 200;
        System.out.println(apache.speed);
        System.out.println(apache.gears);
        System.out.println(apache.passengers);

    }
}
