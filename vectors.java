import java.util.Vector;

// Here we will create a vector //

public class vectors {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>(4); // <> -- These are known as the generics which states that all the
                                                    // values are integer values //
        v.add(3);
        v.add(4);
        v.add(5);
        v.add(6);
        v.remove(3);
        System.out.println(v.capacity());

        for (int i : v) {
            System.out.println(i);
        }
    }
}
