package Tutorials.Interfaces;

public class Galaxy implements Phone {

    @Override
    public String processor() {
        return "SD500";
    }

    @Override
    public String OS() {
        return null;
    }

    @Override
    public int spaceInGB() {
        return 0;
    }
    
}
