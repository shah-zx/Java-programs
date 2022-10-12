package Tutorials.Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

class Student {
 
    // Attributes of a student
    int rollno;
    String name, address;
 
    // Constructor
    public Student(int rollno, String name, String address)
    {
 
        // This keyword refers to current instance itself
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
 
    // Method of Student class
    // To print student details in main()
    public String toString()
    {
 
        // Returning attributes of Student
        return this.rollno + " " + this.name + " "
            + this.address;
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
