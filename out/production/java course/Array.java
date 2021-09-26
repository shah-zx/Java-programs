public class Array {

    public static void arrfunc(int[] array) {
        array[3] = 4;
        array[4] = 5;
        for(int i  = 0; i < array.length; i++) 
        {
            System.out.println(array[i]);
        }
    }


    public static void main(String[] args) {

        int[] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        // System.out.println(array[0]);
        // System.out.println(array[1]);
        // System.out.println(array[2]);
        arrfunc(array);
    }
}
