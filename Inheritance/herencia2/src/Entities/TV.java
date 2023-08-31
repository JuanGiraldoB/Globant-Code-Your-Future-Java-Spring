package Entities;

import java.util.Scanner;

public class TV extends Appliance {

    private Integer displaySize;
    private Boolean tdt;

    public TV() {
    }

    public TV(Integer price, String color, Character energyConsumptionType, Double weight, Integer displaySize, Boolean tdt) {
        super(price, color, energyConsumptionType, weight);
        this.displaySize = displaySize;
        this.tdt = tdt;
    }

    public void createTV() {
        Scanner scan = new Scanner(System.in);

        super.createAppliance();

        System.out.print("Display: ");
        int display = scan.nextInt();
        setDisplaySize(display);


        System.out.print("TDT: ");
        boolean tdt = scan.nextBoolean();
        setTdt(tdt);

        setPrice(finalPrice());
    }

    @Override
    public int finalPrice(){
        int price = super.finalPrice();

        if (displaySize > 40) {
            price = (int) (price * 1.3);
        }

        if (tdt) {
            price += 500;
        }

        return price;
    }

    public Integer getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(Integer displaySize) {
        this.displaySize = displaySize;
    }

    public Boolean getTdt() {
        return tdt;
    }

    public void setTdt(Boolean tdt) {
        this.tdt = tdt;
    }

    @Override
    public String toString() {
        return "TV{" +
                "displaySize=" + displaySize +
                ", tdt=" + tdt +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", energyConsumptionType=" + energyConsumptionType +
                ", weight=" + weight +
                '}';
    }
}
