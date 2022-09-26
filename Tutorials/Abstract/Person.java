package Tutorials.Abstract;

public abstract class Person implements isAlive , liveLife{
    public void Speak(){
        System.out.println("The person is speaking");
    }
    public abstract void eat();
}
