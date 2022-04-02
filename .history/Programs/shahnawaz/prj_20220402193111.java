
// Here we will study about constructors

package programs.shahnawaz;

public class prj {

    public static void main(String[] args) {

        class Mymain {
            public Mymain() {
                id = 10;
                name = "default name";
            }

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
        Mymain shahnawaz = new Mymain();
        // shahnawaz.setid(1);
        // shahnawaz.setName("Coder");
        System.out.println(shahnawaz.getName());
        System.out.println(shahnawaz.getId());

    }
}
