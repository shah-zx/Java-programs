
package Tutorials;

public class Person {

    // Doing encapsulation - making the public as private 

    private String name;
    private String surname;
    private int age;
    public String toString(){
        return "Person + [name =" + name + ", surname =" + surname +" , age =" + age + "]";
    }
}
