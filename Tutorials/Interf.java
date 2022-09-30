package Tutorials;

// import java.util.LinkedList;
import java.util.List;

class Test<T> {
    // An object of type T is declared
    T obj;
    Test(T obj) { 
        this.obj = obj;
     } // constructor
    public T getObject() {
         return this.obj; 
        }
}
  
// Driver class to test above

public class Interf {
    public static void main(String[] args)
    {
        // instance of Integer type
        Test<Integer> fg = new Test<Integer>(15);
        System.out.println(fg.getObject());
  
        // instance of String type
        Test<String> gf
            = new Test<String>("Shahnawaz");
        System.out.println(gf.getObject());
        
    }
}
