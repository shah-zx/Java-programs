
// Multi dimensional arrays are array of arrays //

public class mutlidimensionalarray {
    public static void main(String[] args) {
        System.out.println();
        
        // Creaing a 2-d array //

        int [][] flats;

        flats = new int [2][2];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[1][0]= 103;
        flats[1][1] = 104;
       
        //  Displaying an array //

        for (int i = 0; i < flats.length; i++) {
            for(int j=0;j<flats[i].length;j++)
            {
            System.out.println(flats[i][j]);
            System.out.println(" ");
            }
     System.out.println("\n");
        }
        

    }
}
