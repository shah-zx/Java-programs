
// Here we will study about constructors

package programs.shahnawaz;

public class prj {

    public static void main(String[] args) {

        class Mymain {
            // public Mymain() {
            // id = 10;
            // name = "default name";
            // }

            public Mymain(String naam, int pass) { // Passing a parametre
                id = pass;
                name = naam;
            }

            // We can do constructor over loading as well :

            public Mymain(int roll, int hieght, int weight) { // Passing a parametre
                r = roll;
                h = hieght;
                w = weight;
            }

            private int id;
            private String name;
            public int r;
            public int h;
            private int w;

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

            public int getr() {
                return r;
            }
            public int geth() {
                return h;
            }
            public int getw() {
                return w;
            }


        }
        // Mymain shahnawaz = new Mymain("Hamza", 78);
        Mymain hamza = new Mymain(23, 45, 67);
        // shahnawaz.setid(1); // if no constraints are given then the constructor will
        // come into picture
        // shahnawaz.setName("Coder");
        // System.out.println(shahnawaz.getName());
        // System.out.println(shahnawaz.getId());

        System.out.println(hamza.getName());
        System.out.println(hamza.getId());

    }
}
