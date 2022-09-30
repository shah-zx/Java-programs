package Tutorials;
import java.util.*;
// import java.util.Iterator;


public class Iterat {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Shahnawaz");
        list.add("Hamza");
        list.add("Saurabh");
        list.add("Govind");
        list.add("Pooja");
        System.out.println();
        Iterat app = new Iterat();
        app.printList(list);
    }
    void printList(List<String> list) {
     Iterator<String> it = list.iterator();  // Printing the names using the iterator // 
     while(it.hasNext()) {
         System.out.println(it.next());
     }
    }
}
