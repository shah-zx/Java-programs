package programs;

public class muarr {
    public static void main(String[] args) {
        System.out.println();
        int[][] flats;
        flats = new int[2][3];
        flats[0][0] = 23;
        flats[0][1] = 45;
        flats[0][2] = 78;
        flats[1][0] = 90;
        flats[1][1] = 12;
        flats[1][2] = 20;
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
        }
    }
}
