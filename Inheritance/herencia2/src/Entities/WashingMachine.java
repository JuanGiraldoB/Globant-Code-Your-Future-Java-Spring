package Entities;

import java.util.Scanner;

public class WashingMachine extends Appliance {

    private Integer load;

    public WashingMachine() {
    }

    public WashingMachine(Integer price, String color, Character energyConsumptionType, Double weight, Integer load) {
        super(price, color, energyConsumptionType, weight);
        this.load = load;
    }

    public void createWashingMachine(){
        Scanner scan = new Scanner(System.in);

        super.createAppliance();

        System.out.print("Load: ");
        int load = scan.nextInt();
        setLoad(load);

        setPrice(finalPrice());
    }

    @Override
    public int finalPrice(){
        int price = super.finalPrice();

        System.out.println("wow");
        if (load > 30){
            price += 500;
        }

        return price;
    }

    public Integer getLoad() {
        return load;
    }

    public void setLoad(Integer load) {
        this.load = load;
    }

    @Override
    public String toString() {
        return "WashingMachine{" +
                "load=" + load +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", energyConsumptionType=" + energyConsumptionType +
                ", weight=" + weight +
                '}';
    }
}
