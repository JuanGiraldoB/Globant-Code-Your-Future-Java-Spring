package Entities.ArmorParts;

public class Synthesizer extends Device{

    private String msg;

    public Synthesizer(String msg, Integer energyConsumption, Boolean isDamaged) {
        super(energyConsumption, isDamaged);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
