package Tutorials;

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
        System.out.println(data);         
                                    
  }
}
