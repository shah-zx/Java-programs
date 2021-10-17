
// If we want to give a function more than one argument then we use the variable arguments //

public class vararg {

    // static int sum(int a, int b) {
    // return a + b;
    // }

    // static int sum(int a, int b, int c) {
    // return a + b + c;
    // }

    // static int sum(int a, int b, int c, int d) {
    // return a + b + c + d;
    // }

    // Here is the method for more arguments //
    static int sum(int x, int... arr) // Here x is a compulsory parameter //
    {
        int res = 0;
        for (int a : arr) {
            res += a;
        }
        // This will be available as int []arr;
        return res;
    }

    public static void main(String[] args) {
        // int c = 2;
        // int d = 9;
        // int i = 4;
        // int j = 5;
        // int e;
        // int f;
        // int g;
        // // This is the way of accessing the function // // sum //
        System.out.println("The sum of 4 and 5 is :- " + sum(4,5));
        System.out.println("The sum of 4 , 3 and 5 is :- " + sum(4, 3 , 5));
        System.out.println("The sum of 4 , 3 , 2 and 5 is :- " + sum(4 , 3 , 2 ,5));

        

        // e = sum(c, d);
        // f = sum(d, i, j);
        // g = sum(c, d, i, j);
        // System.out.println(sum);
        // System.out.println(f);
        // System.out.println(g);
       // Here what we are doing .. we are overloading the same function wuth number of parameters //
       // But we dont need so much methods //
      // Here we will use the variable arguments //
    }

}
