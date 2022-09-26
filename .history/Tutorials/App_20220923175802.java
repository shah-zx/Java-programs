package Tutorials;

public class App {
    public static void main(String[] args) {
        App app = new App();
        int value = 10;
        app.DisplayValue(value);
        System.out.println("The value in the main method is :" + value);
        
    }
    void DisplayValue(int value) {
        System.out.println("The current value is :" + value);
    }
}
