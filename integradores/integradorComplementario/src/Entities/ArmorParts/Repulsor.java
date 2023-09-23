package Entities.ArmorParts;

public class Repulsor extends Device{

    private Integer power;

    public Repulsor(Integer power, Boolean isDamaged, Integer energyConsumption) {
        super(energyConsumption, isDamaged);
        this.power = power;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

}
