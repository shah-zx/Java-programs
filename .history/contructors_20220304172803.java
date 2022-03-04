
class Rectangle
{
    int lenght , breadth;
    Rectangle(int x , int y )   // Here we created a constructor //   // It is having the instances of the class Rectangle //
    {
       lenght = x;
       breadth = y;
    }

    int area()
    {
          return (lenght / breadth);
      
    }
}

public class contructors {
    public static void main(String[] args) {
        
        Rectangle r1 = new Rectangle(4, 5);
        int a = r1.area();
        System.out.println(a);

    }

}
