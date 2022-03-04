
// import jdk.tools.jlink.internal.SymLinkResourcePoolEntry;

// Abstract class means kahayali pulao //
// Not exisiting //

// In java : abstract method is declared without an implementation //
// An abstract method makes whole class abstract //
// Abstaract classes cant make object of their own //

abstract class Base  // This class can be inherited and from this many classes can be formed //
{
    Base(){
        System.out.println("Me base ka construictor hu");
    }
    public void say()
    {
        System.out.println("Hello");
    }

    abstract public void greet();   // An abstract method // 
    
}

class derive extends Base
{
 @Override
public void greet()
{
    System.out.println("Good morning");
}


abstract class derive2 extends Base
{
    public void method()
    {
        System.out.println("Hi");
    }
}

}
public class Abstractclasses {
    public static void main(String[] args) {
        derive d = new derive();
        d.greet();
        System.out.println();
    }
}
