import java.util.Scanner;

// Here we will learn about switch statements in java //
// Switch case helps in making decisions //

public class switchcase {
    public static void main(String[] args) {
        int age;
        char var = 'r';
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        switch (var) {
            case 'r':  // Different cases //
                System.out.println("You are goin gto become an adult");
                break;
            case 'c':
                System.out.println("You are ready for a job");
                break; // Break out and move out of the switch code segment //
            case 'd':
                System.out.println("You are going to retire");
            default:
                System.out.println("Enjoy your life");
        }

        Scanner s = new Scanner(System.in);
        age = s.nextInt();
        if (age>50)
        {
        System.out.println("You are experienced!");
        }
        else if(age>46)
        {
        System.out.println("You are semi experienced");
        }
        else if(age>36)
        {
        System.out.println("you are semi semi experienced");
        }
        else{
        System.out.println("You are not experienced");
        }
        System.out.println("Hey you are out of the switch code");
    }
}
