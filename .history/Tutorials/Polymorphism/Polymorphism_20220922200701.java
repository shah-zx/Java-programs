package Tutorials.Polymorphism;

public class Polymorphism {
public static void main(String[] args) {
    Phone redmi = new Redminote8("redmi");   // As redminote8 extends the phone we are able to do so 
    redmi.features();
    Phone Nokia3310 = new Nokia3310("Nokia");
    Nokia3310.features(); //  Feature method from the parent class would be called automatically //

    // public int dailyDriver(int dd){
    //     switch(dd){
    //         case 1:
            
    //     }
    // }
}
}
