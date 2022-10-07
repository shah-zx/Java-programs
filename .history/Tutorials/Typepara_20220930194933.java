package Tutorials;

import java.util.ArrayList;
import java.util.List;

class Data<K, V> {

  private K key;
  private V value;

  public Data(K key, V value) {
    this.key = key;
    this.value = value;
  }

  public K getKey() {
    return key;
  }
  public V getValue() {
    return value;
  }
  public <E> void printListData(List<E> list){
          for(E element : list){
            System.out.println(element);
          }
  }
  public <E> void printData(E[] arrayData){
    for(E element : arrayData){
      System.out.println(element);
    }
  }
}

public class Typepara {

  public static void main(String[] args) {
    System.out.println();
         
         /*                            
         T- Type
         E- Element
         K- Key
         N- Number
         V- Value
         */

        Data data = new Data(1 , "Shahnawaz");
        Data <Integer , String> dat = new Data<Integer, String>(1 , "Shahnawaz");
        // System.out.println(data);  
        System.out.println(dat.getKey());       
        System.out.println(dat.getValue());
        List <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

  }
}
