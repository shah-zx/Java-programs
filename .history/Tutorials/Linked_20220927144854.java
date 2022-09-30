package Tutorials;

import java.util.LinkedList;

public class Linked {
    public static void main(String[] args) {
        System.out.println();
        LinkedList<String> cd = new LinkedList<>();
        cd.add("Shahnawaz");
        cd.add("Hamza");
        cd.add("Ajinkya");
        cd.add("Anurag");    
        cd.add("Bragil");
        cd.set(4, "Brazil");
        new Linked().printList(cd);
    }
    void printList(LinkedList<String> cd){
         for(String name: cd){
             System.out.println(name);
         }
    }
}
