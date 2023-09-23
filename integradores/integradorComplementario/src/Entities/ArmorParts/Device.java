package Entities.ArmorParts;

public abstract class Device {

    private Integer energyConsumption;
    private Boolean isDamaged;

    public Device(Integer energyConsumption, Boolean isDamaged) {
        this.energyConsumption = energyConsumption;
        this.isDamaged = isDamaged;
    }

    public Integer getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(Integer energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public Boolean getDamaged() {
        return isDamaged;
    }

    public void setDamaged(Boolean damaged) {
        isDamaged = damaged;
    }
}
