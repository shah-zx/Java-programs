package Tutorials;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Linked {

  public static void main(String[] args) {
    System.out.println();
    LinkedList<String> cd = new LinkedList<>();
    // Elements hv 0 based indexing //
    cd.add("Shahnawaz");
    cd.add("Hamza");
    cd.add("Ajinkya");
    cd.add("Anurag");
    cd.add("Bragil");
    cd.set(4, "Brazil"); // Foe changing the string //
    cd.remove(2);
    new Linked().printList(cd);
    List<String> dc = new LinkedList<String>(); // Using a List instead of linked list
    dc.add("Shahnawaz");
    dc.add("Hamza");
    System.out.println(dc);
    cd.sort(null);  // Used for sorting 
    System.out.println(cd);
    Collections.reverse(cd); // Used for reversing 
    System.out.println(cd);
    Collections.reverse(cd); // Used for reversing 
  }

  void printList(LinkedList<String> cd) {
    for (String name : cd) {
      System.out.println(name);
    }
  }
  // Iterators //
}
