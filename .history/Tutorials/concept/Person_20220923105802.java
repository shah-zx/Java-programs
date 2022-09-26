
package Tutorials.concept;

public class Person {

    // Doing encapsulation - making the public as private 

    private String name;
    private String surname;
    private int age;

    public Person(String name , String surname , int age){
         this.name = "John";
         this.surname = "doe";
         this.age = 20;
    }

    public String toString(){
        return "Person + [name =" + name + ", surname =" + surname +" , age =" + age + "]";
    }

    // public void setName(String name) {
    //     this.name = name;
    // }

    // public void setSurname(String surname) {
    //     this.surname = surname;
    // }

    public void setAge(int age) {
        this.age = age;
    }
}
