
// Here we will study about constructors

package programs.shahnawaz;

class Mymain {
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setid(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

}

public class prj {
    public static void main(String[] args) {
        Mymain shahnawaz = new Mymain();
        shahnawaz.setid(1);
        shahnawaz.setName("Coder");
        System.out.println(shahnawaz.getName());
        System.out.println(shahnawaz.getId());

    }
}
