
// We will make a class //

class Ekclass {
    int a;

    Ekclass(int v) {
        this.a = v; // Here we used this to provide reference on an object on which the method is
                    // being run //
    }

    public int getA() {
        return a;
    }

    public int returnOne() {
        return 1;
    }
}

class Doclass extends Ekclass {

    Doclass(int c)

    {
        super(c);
        System.out.println("Me ek constructor hoon");
    }
}

public class Thisandsuper {
    public static void main(String[] args) {
        Ekclass obj = new Ekclass(4);
        int s = obj.getA();
        System.out.println(s);
    }
}
