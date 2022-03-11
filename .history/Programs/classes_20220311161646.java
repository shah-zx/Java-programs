package programs;



public class classes {
    
    class Job{
        int id;
        String name;
    }public static void main(String[] args) {
        System.out.println();
        Job trainee = new Job();
        trainee.id = 100;
        trainee.name = "Developer";
        System.out.println(trainee.id);
        System.out.println(trainee.name);
    }
}
