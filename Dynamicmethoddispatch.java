
// Fisrt we will make a class //

class Phone
{
    public void on()
    {
        System.out.println("Turning on phone ");
    }
    public void greet()
    {
        System.out.println("Hello good morning");
    }
}

class Smartphone extends  Phone
{
    public void on()
    {
        System.out.println("Turning on smartphone");
    }
    public void swagat()
    {
        System.out.println("Ayeye apka swagat hai !!");
    }
}


public class Dynamicmethoddispatch {
    public static void main(String[] args) {
//        Phone on = new Phone();   // We can do this we know //
        // But we can also do this : //
        Phone  pixel = new Smartphone();  // We can create an object of the base class using the sub class //  // But not the object of sub class using base class //
        // Smartphone pix = new Phone();  // Not allowed //
        pixel.greet();
        pixel.on();   // This is also known as runtime polymorphism and dynamic method dispatch //
        // This call will run the method of smartphone as the actual object is smartphone //
//        on.name();
//        System.out.println("Hello world");
    }
}
