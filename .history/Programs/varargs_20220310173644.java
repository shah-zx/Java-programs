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
        int f = Helo(5,4,3,2);
        int o = Helo(5,4,3,5,4,6,7);
        System.out.println(f);
        System.out.println(o);
    }
}
