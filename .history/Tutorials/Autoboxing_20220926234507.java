package Tutorials;

import java.util.ArrayList;

class intWrapper {

  public int value;

  public intWrapper(int value) {
    this.value = value;
  }

public int getValue() {
    return value;
}

public void setValue(int value) {
    this.value = value;
}
}

public class Autoboxing {

  static ArrayList<String> gf = new ArrayList<String>();
  static ArrayList<intWrapper> gh = new ArrayList<intWrapper>();

  public static void main(String[] args) {
    gf.add("shahnawaz");
    gf.add("hamza");
    gf.add("rahul");
    String j = gf.get(2);
    System.out.println(j);
    gh.add(new intWrapper(20));    // Primitive data into object 
    System.out.println(gh.get(0).getValue());  // Unboxing 
    ArrayList<double> a = new ArrayList<double>();
  }
}
