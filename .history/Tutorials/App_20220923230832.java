package Tutorials;

public class App {

  public static void main(String[] args) {
    App app = new App();
    int value = 10;
    int memory = 50;
    // This concept is known as  call by value -
    app.DisplayValue(value);
    System.out.println("The value in the main method is :" + value);
    app.DisplayMemory(memory);
    // System.out.println("The value of memory is:" + memory);
  }

  void DisplayValue(int value) {
    System.out.println("The current value is :" + value);
  }

  void DisplayMemory(int memory) {
    System.out.println("The memory of the system is:" + memory);
  }

  //   call by reference  - 

  

}
