package programs;

public class recursion {

    static int Fact(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        int u;
        u = n * Fact(n - 1);
        return u;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
