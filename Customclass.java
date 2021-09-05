
// Our custom class //
class employee

{
    int id;
    String name;
    int salary;
    // Making a method here //

    public void printdetails()
    {
        System.out.println("Hey this is shahnawaz " + id);
        System.out.println("Hey this is my profile " + name);
        System.out.println("My salary is " + salary);
    }

}

public class Customclass {

public static void main(String[] args) {
       employee shanu = new employee();

       // Setting arttributes //

       shanu.id = 67;
       shanu.name = "developer";
       shanu.salary = 60000;
       shanu.printdetails();
   } 
}
