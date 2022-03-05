package programs;

public class resdatatyp {
    public static void main(String[] args) {
        System.out.println();
        int f = 90;
        int i = 0;
        int d = f + i;
        System.out.println(d);
        System.out.println(d.getClass().getName());
    }
}

// Result = byte + short -> integer
// Result = short + integer -> integer
// Result = long + float -> float
// Result = integer + float -> float
// Result = character + integer -> integer
// Result = character + short -> integer
// Result = long + double -> double
// Result = float + double -> double

