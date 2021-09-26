// Here we will study about the main thing in java //
// Do not repeat yourself :- DRY //
// One java file can have only one public class //
class Employee {
    String name;
    int id;

    public void printdetails() {
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);

    }
}

public class Objectorientedpeogramming {
    // Writing our custom class //
    public static void main(String[] args) {
        System.out.println("This is our class (custom)");
        Employee shahnawaz = new Employee(); // Instantiating a new Employee object //
        Employee hamza = new Employee(); // Instantiating a new Employee object //

        // Setting Attributes //
        // Properties : Attributes // Behaviour : Methods //
        shahnawaz.id = 34;
        shahnawaz.name = "developer";
        hamza.id = 34;
        hamza.name = "developer";

        // Printing the properties //

        System.out.println(shahnawaz.id);
        System.out.println(shahnawaz.name);

        // calling the method which we have constructed in the Employee class //
        shahnawaz.printdetails();

    }
}
