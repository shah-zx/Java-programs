package programs;

public class acmod {

    public static void main(String[] args) {
        public class Hi{
            public int x = 9;
            public int v = 8;
            protected int b = 1;
            private int d = 17;

            public void det() {
                System.out.println(x);
                System.out.println(v);
                System.out.println(d);
            }
        }

        // System.out.println();
        Hi help = new Hi();
        help.det();

    }
}
