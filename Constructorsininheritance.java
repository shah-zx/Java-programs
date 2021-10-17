
// import derive.childofderive;

// import derive.child;

// import javax.print.event.PrintServiceAttributeListener;

// Here we will make a base class //

class base1 {
    base1() {
        System.out.println("I am a constructor ");
    }

    base1(int x) {
        System.out.println("I am the overloaded constructor of base1 class " + x);
    } // This is the another constructor of base1 class //

    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

////class derive extends base1 {
//
//    derive() {
//        super(0); // This is the keyword for invoking the constructor with the argument //
//        System.out.println("I am the derived class constructor ");
//    }
//
//    derive(int x, int y) {
//        super(x);
//        System.out.println("Overloaded constructor of derived with arguments and values : " + y);
//
//    }
//
//}

class childOfDerive extends derive {
    childOfDerive() {
        System.out.println("I am a constructor of chiid class derived from the derived class. ");
    }

    childOfDerive(int x, int y, int z) {
//        super(x, y);
        System.out.println("I am a constructor of chiid class derived from the derived class. " + z);
    }

    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}

public class Constructorsininheritance {
    public static void main(String[] args) {
        System.out.println();
        // base1 obj = new base1(); // Create a new object // // As soon as this object
        // is made the constructor is
        // invoked //
        // derive d = new derive(); // Here as we made the new object of the derived
        // class we will automatically get
        // the constructor of the base class //
        // First the base class constuctor then the derived class is called //
        // derive f = new derive(5,6);
        childOfDerive cd = new childOfDerive(12, 13, 15);
        System.out.println(cd);
        derive s = new derive();
        System.out.println(s);
//        derive f = new derive(10 , 20);

    }
}
