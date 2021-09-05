// Here we will see how to make objects in java //

// For making objects we need a class //

class myClass {

     

     void give() {
        int a = 10, b = 12;
        System.out.println(a*b);
        System.out.println("Hello , this is the return from myClass.");
    }

}

public class Objects {
    public static void main(String[] args) {
        System.out.println("Here we called the myClass");
        // For creating an object we need to do : //
        myClass re = new myClass(); // myClass is the constructor here //
        re.give(); // With the help of the object we are able to acces the method //
        


    }
}
