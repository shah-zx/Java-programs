// ** First create a class to be inherited ** //

// Now we will see the constructors in inheritance //

class base
{


    
    public int add(int x , int y)
    {
        return (x+y);
    }
}

class derived extends base 
{
    public int mul( int a , int b)
    {
        return (a*b);
    }
}



public class Inheritance {
   public static void main(String[] args) {
       System.out.println("Here we will see the inheritance.");
       derived obj = new derived();
       int e = obj.add(3, 6);   // Acessing the method of the base class //
       System.out.println(e);

   } 
}

//// Here we will see the inheritance in java //
