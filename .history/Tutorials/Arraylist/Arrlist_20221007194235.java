package Tutorials.Arraylist;

// import java.lang.reflect.Array;
import java.util.ArrayList;

// import programs.Arraylist;

public class Arrlist {

  static ArrayList<String> listNames = new ArrayList<>();

  public static void main(String[] args) {
    // We will craete an array list here -

    ArrayList<Integer> num = new ArrayList<>();

    // Adding the items  -

    listNames.add("shahnawaz");
    listNames.add("rahul");
    listNames.add("ajinkya");
    System.out.println(listNames);

    num.add(1);
    num.add(2);
    num.add(3);
    num.add(4);
    System.out.println(num);
    System.out.println("---------------------------");

    ArrayList<String> list = new ArrayList<String>(); //Creating arraylist
    list.add("Mango"); //Adding object in arraylist
    list.add("Apple");
    list.add("Banana");
    list.add("Grapes");
    //Printing the arraylist object
    System.out.println(list);

    // Another example -

    ArrayList<Integer> n = new ArrayList<>();
    n.add(2);
    n.add(3);
    n.add(4);
    n.add(5);
    n.add(6);
    System.out.println(n);

    // These are functions for removing the elememts -
    num.remove(1); // 0 based indexing
    System.out.println(num);
    list.remove("Apple"); // 0 based indexing
    System.out.println(list);
    Arrlist app = new Arrlist();
    int position = app.search("verma");
    if (position != -1) {
      System.out.println("Found");
    } else {
      System.out.println("Not Found");
    }
  }
   n.find(3 , )
  // Function for finding out the position of the string -

  int search(String name) {
    return listNames.indexOf(name);
  }
  boolean find(int g, ArrayList<Integer> list) {
    for(int i = 0; i < list.size(); i++) {
      if(list.get(i) == g) { 
        return true;
      }
    }
  }
}
// Java ArrayList class can contain duplicate elements.
// Java ArrayList class maintains insertion order.
// Java ArrayList class is non synchronized.
// Java ArrayList allows random access because the array works on an index basis.
// In ArrayList, manipulation is a little bit slower than the LinkedList in Java because a lot of shifting needs to occur if any element is removed from the array list.
