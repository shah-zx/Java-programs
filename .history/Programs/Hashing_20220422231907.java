package programs;

import java.util.HashSet;

public class Hashing {
    public static void main(String[] args) {
        System.out.println();

        // Creating a hashset
        HashSet<Integer> hs = new HashSet<>(6, 0.90f);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        hs.add(5);
        System.out.println(hs);
    }
}

// Hash collision
