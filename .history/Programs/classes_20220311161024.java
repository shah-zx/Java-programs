package programs;

class Job {
    public static void main(String[] args) {

    }
    int id;
    String name;
}

public class classes {
    public static void main(String[] args) {
        System.out.println();
        Job trainee = new Job();
        trainee.id = 100;
        trainee.name = "Developer";
        System.out.println(trainee.id);
        System.out.println(trainee.name);
    }
}
