package Tutorials;

// import java.util.LinkedList;


class Data {

  @Override
  public String toString() {
    return "Data [obj=" + obj + "]";
  }

  private Object obj;

  public Data(Object obj) {
    //  super();
    this.obj = obj;
  }

  public Object getObj() {
    return obj;
  }
}

// This is our generic class -


class GenericClass<T>{
        private T data;
        public GenericClass(T data) {
                this.data = data;
        }
        public T getData() {
                return data;
        }
        @Override
        public String toString() {
                return "GenericClass [data=" + data + "]";
        }
}
public  class Generic {

  // Comparable Interface Implementation -

  // Java Comparable interface is used to order the objects of the user-defined class. This interface is found in java.lang package and contains only one method named compareTo(Object). It provides a single sorting sequence only, i.e., you can sort the elements on the basis of single data member only. For example, it may be rollno, name, age or anything else.
  public static void main(String[] args) {
//     Data data = new Data("Some String");
//     String variable = (String) data.getObj();
//     System.out.println(variable);
    // fg.add("shahnawaz");
    // fg.add("hamza");
    // fg.add("saurav");
    // fg.add("hussain");
    // fg.add("shashank");
    // fg.add("prathmesh");
    GenericClass <String> genericData = new GenericClass("Some data");
    String data = (String) genericData.getData();
    System.out.println(data);
  }
} 
