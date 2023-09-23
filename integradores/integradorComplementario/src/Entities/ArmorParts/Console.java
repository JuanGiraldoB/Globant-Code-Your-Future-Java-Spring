package Entities.ArmorParts;

public class Console extends Device{

    private String msg;

    public Console(String msg, Integer energyConsumption, Boolean isDamaged) {
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
