/* This was for the first question */

abstract class pen {
    abstract void write();

    abstract void refill();
}

class fountainPen extends pen {
    void write() {
        System.out.println("write");
    }

    void refill() {
        System.out.println("refill");

    }

    void changeNib() {
        System.out.println("Changing the nib.");
    }
}

/* End of the first question */

/* This is our second question */

abstract class monkey {
    abstract void jump();

    abstract void bite();
}

class human extends monkey implements basicAnimal {
    void jump(){
        System.out.println("jumping");
        
    }
    void bite()
    {
        System.out.println("biting");
    } 

    public void eat(){
        System.out.println("eating");
    }
    
    public void sleep(){
        System.out.println("sleeping");
    }
}

interface basicAnimal {
    void eat();
    void sleep();
}

/* End of second question */

public class Exerciseabstrcls {

    public static void main(String[] args) {
        System.out.println();
        fountainPen myPen = new fountainPen();
        myPen.changeNib();
        human shanu = new human();
        shanu.sleep();
    }
}
