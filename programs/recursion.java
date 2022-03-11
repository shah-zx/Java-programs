package programs;

public class recursion {

    static int Fact(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        return  n * Fact(n - 1);
    }

    public static void main(String[] args) {
        System.out.println();
        int o = Fact(5);
        System.out.println(o);
    }
}
