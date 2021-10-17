package Arrays;
import java.util.*;

public class yash {
    public static void main(String args[]) {
     Scanner sc= new Scanner(System.in);
     System.out.println(sc);
    //  System.out.println("Enter the current base of the number :-");
    //  int base1=sc.nextInt();
    //  System.out.println("Enter the base in which the number is to be converted :-");
    //  int base2=sc.nextInt();
     System.out.println("Enter the number :");
     int n=sc.nextInt(); // number //
     int c=Any_to_Dec(n); // first function call //
    //  int ans=Dec_to_Any(c,base2); // second function call //
    //  System.out.println("The result after converting is :- " + ans);
    System.out.println(c);

    }
    public static int Any_to_Dec(int n)
    {
        int mul=1,ans=0;
        while(n!=0)
        { 
           int rem =n%8;
           ans = ans +rem *mul;
           n=n/8;
        }
        return ans; 
    }
    //  public static int Dec_to_Any(int n, int dest)
    // {
    //     int mul=1,ans=0;
    //     while(n!=0)
    //     { 
    //        int rem = n%dest;
    //        ans = ans +rem *mul;
    //        mul=mul*10;
    //        n=n/dest;
    //     }
    //     return ans;
    // }
    

}

