package Tutorials;

import java.util.ArrayList;

class intWrapper {

  public int value;

  public intWrapper(int value) {
    this.value =value;
  }
}

public class Autoboxing {

  static ArrayList<String> gf = new ArrayList<String>();

  public static void main(String[] args) {
    gf.add("shahnawaz");
    gf.add("hamza");
    gf.add("rahul");
    String j = gf.get(2);
    System.out.println(j);
  }
}
