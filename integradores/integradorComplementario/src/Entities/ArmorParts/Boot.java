package Entities.ArmorParts;

public class Boot extends Device{

    private Propeller propeller;
    private String primaryColor;
    private String secondaryColor;


    public Boot(Propeller propeller, String primaryColor, String secondaryColor, Integer energyConsumption, Boolean isDamaged) {
        super(energyConsumption, isDamaged);
        this.propeller = propeller;
        this.primaryColor = primaryColor;
        this.secondaryColor = secondaryColor;
    }

    public Propeller getPropeller() {
        return propeller;
    }

    public void setPropeller(Propeller propeller) {
        this.propeller = propeller;
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

}
