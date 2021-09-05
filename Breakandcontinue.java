
// Here we will learn about the break and continue in loops //
// Break can  be used with for , while , do while //
public class Breakandcontinue {
    public static void main(String[] args) {
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            System.out.println("Java is great");
            if (i == 2) {
                System.out.println("Ending the loop");
                break; // will break out of the loop //
            }

            int p = 0;
            while (p < 5) {
                System.out.println();
                for (int k = 0; k < 5; k++) {
                    System.out.println(k);
                    System.out.println("Java is great");
                    if (k == 2) {
                        System.out.println("Ending the loop");
                        break; // will break out of the loop //
                    }
                    p++;

                }
                System.out.println("End of the loop ");
            }
            for (int d = 0; d < 50; d++) {
                System.out.println(d);
            }
        }
    }

}