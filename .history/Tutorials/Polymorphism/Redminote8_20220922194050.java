package Tutorials.Polymorphism;

public class Redminote8 extends Phone{
    public String model;

    public Redminote8(String model) {
    model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void features(){
        System.out.println("Redmi note 8");
    }
    
}
