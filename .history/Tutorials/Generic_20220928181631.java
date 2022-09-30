package Tutorials;

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
public class Generic {
    
        // Comparable Interface Implementation - 

        // Java Comparable interface is used to order the objects of the user-defined class. This interface is found in java.lang package and contains only one method named compareTo(Object). It provides a single sorting sequence only, i.e., you can sort the elements on the basis of single data member only. For example, it may be rollno, name, age or anything else.
        

}
