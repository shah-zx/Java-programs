
// Here we will study about java methods //
// They are used when we want to make our code smaller //

public class Methods {


    // First method //

    static int fir(int m , int n)
    {
         return m%n;
    }

    // If we are having these lines of code and we dont want to use it many times ,
    // then we can use methods //
    // Creating an array //

    // Method overloading //

    static void foo() {
        System.out.println("Good morning");
    }

    static void foo(int x) {
        System.out.println("Good morning" + x);
    }
     
// Above are two methods with same name but different work //


    // Chnging the array //

    static void change(int a) {
        a = 45;
    }

    // Method for changing the integer //

    static void change(int[] arr) {
        arr[0] = 98;
    }

    static void tellJoke() { // When we dont want to return any thing we use the void method //
        System.out.println("Hello there");
    }

    static int logic(int x, int y) {   // int x and int y are parameteres //
        int z;
        if (x > y) {
            z = x * y;
        } else {
            z = (x + y) * 5;

        }
        return z;
    }

    // creating a method //

    public static void main(String[] args) {
        int f = 5;
        int g = 7;
        int h;
        h = logic(f, g); // Calling the function //
        System.out.println(h);

        int f1 = 6;
        int f2 = 9;
        int h1;
        h1 = logic(f1, f2);
        System.out.println(h1);

        // We can call the function as many times as we want //
        // We have to create an object to call a function //
        // Vlaues are not changed after passing it to the fucntion , because they are
        // the copies //

        // Method overloading //

        // Another method //

        tellJoke();
        int[] marks = { 78, 79, 80, 81, 82 };
        // Case -1 //
        // Changing the integer //
        // int b = 7;
        // int s;
        // change(b);
        // System.out.println(b);

        // Changing the array //
        change(marks); // As marks is the reference for the object {78,79,80,81,82} , therefore it is
                       // also containing
        // the address of the object so when we pass that value to the function
        // We are able to change the value //

        System.out.println(marks[0]);
        // This will change the object //

        // Method overloading : Two or more methods can have some name but different
        // parameters. such methods are called overloaded methods //
        
        foo(); // Function-1 
        foo(23); // Function -2
        // Arguments are actual and parameters are copy //
        // Above we did method overloading //

        // Calling the fir method //
        int e = fir(3, 2);
        System.out.println(e);
    }

}
