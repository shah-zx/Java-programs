// Here we will learn about arrays //

public class Arrays {
    public static void main(String[] args) {
        // Suppose we are having marks of 500 students and we have to store them //
        // We will create array for that //
        System.out.println();
        int marks[] = new int[5]; // Creating an array //  // Declaration and creation of the array at the same time //
        // int marks[] -- declaration // // marks = new int[5] -- creation //
        // combining both -- int marks[] = new int[5];
        // How to access the marks elements //
        marks[0] = 90;
        marks[1] = 80;
        marks[3] = 85;
        marks[4] = 84;
        // changing the value of element //
        marks[4] = 92;
        // we cant print the element which is out of index //
        System.out.println(marks[4]);

        int[] num = new int[4];
        num[0] = 1;
        num[1] = 2;
        num[3] = 3;

        System.out.println(num[3]);

        // Another way of creating array //

        // int[] home; 

        // Declaration and initailization //
        int[] id = { 1, 2, 3, 4, 5, 6, };

        System.out.println(id[0]);
        System.out.println(id[1]);
        System.out.println(id[2]);
        System.out.println(id[3]);
        System.out.println(id[4]);

// Any index start from n and goes till n-1 where n is the size of the array //
        int numbers[] = new int[4];
        numbers[0] = 1;
        numbers[1] = 1;
        numbers[2] = 1;
        numbers[3] = 1;
        int s = numbers.length;
        System.out.println("The length is :" + s);
        

    }
}
