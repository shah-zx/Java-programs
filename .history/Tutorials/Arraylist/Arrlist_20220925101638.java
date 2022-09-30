package Tutorials.Arraylist;

// import java.lang.reflect.Array;
import java.util.ArrayList;

// import programs.Arraylist;

public class Arrlist {

  public static void main(String[] args) {
    // We will craete an array list here -

    ArrayList<String> listNames = new ArrayList<>();
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
    
    ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
      list.add("Mango");//Adding object in arraylist    
      list.add("Apple");    
      list.add("Banana");    
      list.add("Grapes");    
      //Printing the arraylist object   
      System.out.println(list);  

      // These are functions for removing the elememts -
      num.remove(1);
      
            

  
    
  }


  

}
