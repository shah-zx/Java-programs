
// Here we will learn about logical operators //
// Logical and :  &&  : Retturns value true when both the values are true //
// Logical or :  ||   : Returns value true when one of the values is true //
// logical not :  !    : Returns true for false annd false for true //

public class Relationalandlogicalop {
    public static void main(String[] args) {
        System.out.println("For logical and");
        boolean a = true;
        boolean b = true;
        boolean c = false;
        if (a && b && c) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }
        System.out.println("For logical or");
        boolean d = true;
        boolean e = true;
        boolean f = false;
        if (d || e || f) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }
        System.out.println("For not operator");
        System.out.println(!a);
    }
}
