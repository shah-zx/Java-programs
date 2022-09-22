package Tutorials.Animal;

public class Reptile {
    public String drySkin;
    public String Backbone;
    public boolean Softshell;

    

    public String getDrySkin() {
        return drySkin;
    }

    public void setDrySkin(String drySkin) {
        this.drySkin = drySkin;
    }

    public String getBackbone() {
        return Backbone;
    }

    public void setBackbone(String backbone) {
        Backbone = backbone;
    }

    public boolean isSoftshell() {
        return Softshell;
    }

    public void setSoftshell(boolean softshell) {
        Softshell = softshell;
    }

    public void ShowInfo(){
        System.out.println(getDrySkin()); 
        System.out.println(getBackbone());
        
    }
}
