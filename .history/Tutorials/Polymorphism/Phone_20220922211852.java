package Tutorials.Polymorphism;

public class Phone {
    private String model;
    public Phone(String model) {
        model = model;
    }
    public void features(){
        System.out.println("Redmi note 8");
        
    }
    public Phone phone(int dd) {
        switch (dd) {
            case 1:
                return new Nokia3310("3310");
                break;
            case 2:
                return new Redminote8("Note 8");
            default:
                break;
        }
        return null;
    }
}
