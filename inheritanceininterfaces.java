

interface sample
{
    void meth1();
    void meth2();
}
interface childMeth extends sample
{

    void meth3();
    void meth4();
}

class Mysampleclass implements sample   // We can implement a base interface //
{
    public void meth3()
    {
        System.out.println("Hello this is method 3");
    }

    public void meth4()
    {
        System.out.println("Hello this is method 4");
    }

    public void meth1()
    {
        System.out.println("Hello this is method 1");
    }
    public void meth2()
    {
        System.out.println("Hello this is method 2");
    }

}


public class inheritanceininterfaces {
    public static void main(String[] args) {
        Mysampleclass obj = new Mysampleclass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
        System.out.println();
    }
}
