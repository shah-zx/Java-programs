

// package out.production.java course;
// Here we will study about varargs which are helpful when we need more arguments to pass to the same function //
// To do this we need to write as : //

public class Methodsvarargs {
    static int sum(int x , int ...arr) // Here we used the varargs // // It stores all the arguments into the array and
                               // returns back the output //
    // If we want that some arguments should be present within the calling function then , we can give like int x , int ...arr //                           
    {
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to the varargs tutorial.");
        System.out.println("The sum of 9 anf 10 is : " + sum(2, 3)); // Here we have called the sum method which adds
                                                                     // the two numbers //
        System.out.println("The sum of 4 , 3 and 5 is : " + sum(2, 4, 5, 6));
        System.out.println("The sum of 4 , 3 and 5 is : " + sum(2, 4, 5, 6, 7));
        // We can give as many args we want //

    }
}
