package Tutorials;

public class App {
    public static void main(String[] args) {
        App app = new App();
        int value = 10;
        // This concept is known as  call by value - 
        app.DisplayValue(value);  
        System.out.println("The value in the main method is :" + value);
        
    }
    void DisplayValue(int value) {
        System.out.println("The current value is :" + value);
    }
    void DisplayMemory(int memory){
       System.out.println("The memory of the system is:" + memory);
    }
}
