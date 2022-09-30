package Tutorials;
import java.util.LinkedList;
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
     Iterator<String> it = list.iterator();
     while(it.hasNext()) {
         System.out.println(it.next());
     }
    }
}
