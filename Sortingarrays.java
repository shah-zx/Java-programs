public class Sortingarrays {
    public static void main(String[] args) {
        // First we will declare an array //

        int arr[]  = {55,40,80,65,71};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Array is :- " + arr[i]);
        }

        // Now for sorting the array // // We will use two for loops //

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] < arr[j])
                {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted list :- ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println( arr[i] );
        }
        System.out.println(" ");
    }
}
