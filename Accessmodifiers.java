
class c1 {
    public int x = 4;
    protected int y = 45;
    int z;
    private int e = 10;

    public void mmeth1() {
        System.out.println("The value of x is " + x);

    }

    public void meth2() {
        System.out.println("The value of y is" + y);
    }

}

class c2 {

}

public class Accessmodifiers {
    public static void main(String[] args) {
        c1 c = new c1();
        c.mmeth1();
        System.out.println();
    }
}
