package Tutorials;

public class Array {
    public static void main(String[] args) {
        int [] intVariable = new int[10];
        intVariable[5] = 10;
        intVariable[6] = 20;
        intVariable[7] = 30;
        intVariable[8] = 40;
        intVariable[9] = 50;
        intVariable[1] = 60;
        intVariable[2] = 70;
        intVariable[3] = 80;
       int [] arr = {1,2,3,4,5,6,7,8,9};
       float [] brr  = {1.02f , 2.09f , 6.7f};
       System.out.println(intVariable[3]); 
       System.out.println(brr[0]);
       System.out.println(brr[1]);
       System.out.println(brr[2]);


        // The for each loop - 
        for(int i = 0; i < arr.length; i++){
           System.out.println(arr[i]);
        }

        // Above can also be done using another loop - \
        for(int value : arr){
                   System.out.println(value);
        }
    }
}
