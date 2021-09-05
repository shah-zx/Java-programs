import javax.print.FlavorException;

// Here we will learn about ther static methods //

// First we will create a class with some static methods in it //

class method
{
    static float mul(float x , float y)
    {
        return (x*y);
    }
    static float div(float s , float p)
    {
        return (s/p);
    }
}

public class staticmethods {
    public static void main(String[] args) {
        System.out.println("Here we will call the static methods  " );
        // Static methods dont require the objects //
        // They are called by the class name //
        float c = method.div(10, 2);
        float d = method.mul(3, 5);
        System.out.println(c);
        System.out.println(d);

    }


}
