package Tutorials.Interfaces;

// For interface - 

public class Oneplus5 implements Phone {

    @Override
    public String processor() {
        return "SD665";
    }

    @Override
    public String OS() {
        return "Android";
    }

    @Override
    public int spaceInGB() {
        return 64;
    }

    
    // public int processor = 835;

    // public int getProcessor() {
    //     return processor;
    // }

    // public void setProcessor(int processor) {
    //     this.processor = processor;
    // }
}
