package Tutorials.Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

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

public void setKey(K key) {
    this.key = key;
}

public V getValue() {
    return value;
}

public void setValue(V value) {
    this.value = value;
}
}



public class data {
    // This is our main class 
    public static void main(String[] args) {
        System.out.println("Data");
    }
    Set<Data> dat = new LinkedHashSet<>();
    
    // Comparator // 
}
