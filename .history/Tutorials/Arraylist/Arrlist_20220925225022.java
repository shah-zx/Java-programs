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

    // These are functions for removing the elememts -
    num.remove(1); // 0 based indexing
    System.out.println(num);
    list.remove("Apple"); // 0 based indexing
    System.out.println(list);
    App app = new App();
    int position = listNames.search("shahnawaz");
  }

  int search(String name) {
    return listNames.indexOf(name);
  }
}


// Java ArrayList class can contain duplicate elements.
// Java ArrayList class maintains insertion order.
// Java ArrayList class is non synchronized.
// Java ArrayList allows random access because the array works on an index basis.
// In ArrayList, manipulation is a little bit slower than the LinkedList in Java because a lot of shifting needs to occur if any element is removed from the array list.
