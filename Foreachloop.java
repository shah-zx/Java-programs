public class Foreachloop {
    public static void main(String[] args) {
        System.out.println();
        // Array length property //
        int []marks = {90,91,92};
        System.out.println(marks.length);

        // // Array can be of floating type //
        // float[]id = {23,24,25};
        // System.out.println(id.length);
        // System.out.println(id[2]);

        // // String array //
        // String[] students = {"shahnawaz" , "hamza" , "rahul"};
        // System.out.println(students[2]);
        // System.out.println(students.length);
        
        // dispalying the array //
        // Naive tarika //

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // System.out.println(marks[3]);
       
        // Displatyng the array using for loop :- //
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        } // Array traversal 
    
        // write the elements in the reverse order of the array //
        for(int i=marks.length-1;i>=0;i--)
        {
            System.out.println(marks[i]);
        } // Array traversal 
        
        // For each element in java //  // Dislapying the array //
        for(int  element: marks)
        {
            System.out.println(element);
        }

    }
}
