package Tutorials.Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class set {

  /**
   * @param args
   */
  public static void main(String[] args) {
    System.out.println("Here we will learn about the sets :");
    // sets only have unique values //
    Set<String> set = new HashSet<String>();
    set.add("Shahnawaz");
    set.add("Hamza");
    set.add("Rahul");
    set.add("Ashish");
    set.add("Ashish");

    // System.out.println(set);
    // for (String n : set) {
    //   System.out.println(n);
    // }
    // System.out.println(set.contains(1)); // 1 is not present in the set.
    // Set<Integer> tes = new LinkedHashSet<Integer>(); // 2nd type of set //
    // int count = 0;
    // for (int i = 30; i > 0; i--) {
    //   // System.out.println(i);
    //   count++;
    // }

    // For each loop -
    // for (int y : tes) {
    //   System.out.println(y);
    // }
    // System.out.println(count);

    Set<Integer> temp = new HashSet<Integer>();
    for (int o = 30; o > 0; o--) {
      temp.add(o); // This is the variable we are adding to our temp tree set //
    }
    for (int f : temp) {
      System.out.println("A" + f);
    }
    Set<String> fed = new LinkedHashSet<String>();
    for(int c = 30; c > 0; c--) {
      fed.add("A" + c);
    }
    for(String z : fed) {
      System.out.println(z);
    }

    // Custmo sorting using comparator // 

  }

  // 1) Hashset 
  // 2) LinkedHshedset
  // 3) Treeset


}
