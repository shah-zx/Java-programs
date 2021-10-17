public class Incrementdecrementopndatatypeofexpression {
    public static void main(String[] args) {

        int a = 654 + 6;
        float b = 6.5f + 6;
        System.out.println(b);
        System.out.println(a);
        // byte x = 5;
        // int y = 6;
        // int z = x + y;
        // System.out.println(z);

        // Increment and decrement operators //
        int i = 56;
        int j = 67;
        int c = ++j; // Here first j is incremented then c is assigned j // (68)
        // int b = i++; // Here first the value of i is assigned to b then its
        // incremented // // Therefore b becomes 56 //
        System.out.println(i++); // Here we are saying that pehle i ko print karo then uski value increment karo //
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
        System.out.println(c);
        int y = 7;
        System.out.println(++y*8);
        char ch = 'a';
        System.out.println(++ch);
    }
}
