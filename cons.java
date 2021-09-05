
class myepm {
    private int id;
    private String name;

    // Overloading the cnstructors //

    public myepm() {
        id = 0;
        name = "Shahnawaz";
    }

    // Making the constructors //
    public myepm(int d, String myname) {
        id = d;
        name = myname;
    }

    public myepm(String myname) {
        id = 2;
        name = myname;
    }

    public String getname() {
        return name;
    }

    public void setname(String n) {
        n = name;
    }

    public void setid(int i) {
        i = id;

    }

    public int getid() {
        return id;
    }
}

public class cons {
    public static void main(String[] args) {
        myepm shanu = new myepm(67, "shanu");
        // We cant make the setid and getid for all the objects , so we need the
        // constrctors //
        System.out.println(shanu.getid());
        System.out.println(shanu.getname());

        // Here in above two lines the constructors are automatically invoked //
        // We dont explicitly invoke the constructor //

    }
}
