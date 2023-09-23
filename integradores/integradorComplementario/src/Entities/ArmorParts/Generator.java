package Entities.ArmorParts;

public class Generator {

    private Float energyLevel;
    private Boolean state;

    public Generator() {
    }

    public Generator(Float energyLevel, Boolean state) {
        this.energyLevel = energyLevel;
        this.state = state;
    }

    public Float getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(Float energyLevel) {
        this.energyLevel = energyLevel;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Generator{" +
                "energyLevel=" + energyLevel +
                ", state=" + state +
                '}';
    }
}
