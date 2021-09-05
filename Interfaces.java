// Here wwe will study about interface //

// In real life interface is a point where two systems meet and interact //

// In java interface is a group of releated methods with empty bodies //

// Interfaces don't have objects //

// Interfaces have references //

// For example //

// we can't use multiple abstract classes for making objects but can use multiple interfaces for doing so //

interface Bicycle
{
     int a = 45;
     void applyBrake(int d);
     int speedUp(int i);
     void blowHorn();
     void blowhorn2();
}

class AvonCycle implements Bicycle
{
    int speed = 7;
    public void applyBrake(int d)   // While declaring the interface methods , we have to make the methods public //
    {
        speed -= d;
    }
    public int speedUp(int i)
    {
        speed =+ i;
        return speed;
    }

    @Override
    public void blowHorn() {
        System.out.println("gum");
    }
    public void blowhorn2()
    {
        System.out.println("pee pee");
    }
}

// NOTE : you cannot modify the properties in interfaces as they are final //

public class Interfaces {
    public static void main(String[] args) {
        AvonCycle shanu = new AvonCycle();
        int e = shanu.speedUp(9);
        shanu.blowHorn();
        shanu.blowhorn2();

        System.out.println(e);
    }
}
