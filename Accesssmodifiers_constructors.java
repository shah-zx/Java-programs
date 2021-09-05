
// Here we will learn about the access modifiers //
// They are of three types : private  , public , protected //
// Private // 
// For making any values secret and not acessible by  others we use [private] method //
// Getters and setters //
// Getter gets the value we passsed in // // Prints the value //
// Setter sets the value //

class Myemployee {
    private int id;
    private String name;

    public void setname(String n) {
        name = n;
    }

    public String getname() {
        return name;
    }

    public void setid(int s) {
        id = s;
    }

    public int getid() {
        return id;
    }
}

public class Accesssmodifiers_constructors {
    public static void main(String[] args) {
        System.out.println();
        Myemployee shanu = new Myemployee();
        // shanu.id = 89;
        // shanu.name = "good";

        shanu.setname("Developer");
        System.out.println(shanu.getname());
        shanu.setid(78);
        System.out.println(shanu.getid());
    }

}
