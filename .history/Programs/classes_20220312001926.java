package programs;

public class classes {

    public static void main(String[] args) {
        class Job {
            int id;
            int salary;
            String name;

            public void printdet() {
                System.out.println("The id is : " + id);
                System.out.println("The name is : " + name);
            }

            public int getSalary(){
                System.out.println("salary is : " + salary);
            }
        }
        System.out.println();
        Job trainee = new Job();
        trainee.id = 100;
        trainee.name = "Developer";
        trainee.salary = 40000;
        Job intern = new Job();
        intern.id = 20;
        intern.name = "Devops";
        // System.out.println(trainee.id);
        // System.out.println(trainee.name);
        trainee.printdet();
        intern.printdet();

    }
}
