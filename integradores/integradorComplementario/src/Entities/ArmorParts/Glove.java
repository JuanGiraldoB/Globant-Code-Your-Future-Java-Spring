package Entities.ArmorParts;

public class Glove extends Device{

    private String primaryColor;
    private String secondaryColor;
    private Repulsor repulsor;


    public Glove(String primaryColor, String secondaryColor, Repulsor repulsor, Integer energyConsumption, Boolean isDamaged) {
        super(energyConsumption, isDamaged);
        this.primaryColor = primaryColor;
        this.secondaryColor = secondaryColor;
        this.repulsor = repulsor;
    }

    public String getPrimaryColor() {
        return primaryColor;
    }

    public void setPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor;
    }

    public String getSecondaryColor() {
        return secondaryColor;
    }

    public void setSecondaryColor(String secondaryColor) {
        this.secondaryColor = secondaryColor;
    }

    public Repulsor getRepulsor() {
        return repulsor;
    }

    public void setRepulsor(Repulsor repulsor) {
        this.repulsor = repulsor;
    }
}
