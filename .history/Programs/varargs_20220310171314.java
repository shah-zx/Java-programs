package programs;

public class varargs {
    static int Helo(int... arr) {
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println();

    }
}
