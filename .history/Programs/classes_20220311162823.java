package programs;

public class classes {

    public static void main(String[] args) {

        class Job {
            int id;
            String name;
            public void printdet(){
                 System.out.println("The id is : " + id);
                 System.out.println("The name is : " + name);
            }
        }
        System.out.println();
        Job trainee = new Job();
        trainee.id = 100;
        trainee.name = "Developer";
        Job intern = new Job();
        // System.out.println(trainee.id);
        // System.out.println(trainee.name);
        trainee.printdet();

        
    }
}