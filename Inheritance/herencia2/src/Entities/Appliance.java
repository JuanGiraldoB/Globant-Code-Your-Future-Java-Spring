package Entities;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Appliance {

    protected Integer price;
    protected String color;
    protected Character energyConsumptionType;
    protected Double weight;

    private static final Set<Character> VALID_CONSUMPTIONS = new HashSet<>();
    private static final Set<String> VALID_COLORS = new HashSet<>();

    static {
        VALID_CONSUMPTIONS.add('A');
        VALID_CONSUMPTIONS.add('B');
        VALID_CONSUMPTIONS.add('C');
        VALID_CONSUMPTIONS.add('D');
        VALID_CONSUMPTIONS.add('E');
        VALID_CONSUMPTIONS.add('F');
        VALID_COLORS.add("WHITE");
        VALID_COLORS.add("BLACK");
        VALID_COLORS.add("RED");
        VALID_COLORS.add("BLUE");
        VALID_COLORS.add("GREY");
    }

    public Appliance() {
    }

    public Appliance(Integer price, String color, Character energyConsumptionType, Double weight) {
        this.price = price;
        this.color = color;
        this.energyConsumptionType = energyConsumptionType;
        this.weight = weight;
    }

    private char checkEnergyConsumption(char ec) {
        char ecUpperCase = Character.toUpperCase(ec);

        if (VALID_CONSUMPTIONS.contains(ecUpperCase)){
            return ecUpperCase;
        }

        return 'F';
    }

    private String checkColor(String color) {
        String colorUpperCase = color.toUpperCase();

        if (VALID_COLORS.contains(colorUpperCase)) {
            return colorUpperCase;
        }

        return "WHITE";
    }

    public void createAppliance() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Color: ");
        String color = scan.nextLine();
        color = checkColor(color);
        setColor(color);

        System.out.print("Energy Consumption (A-F): ");
        char ec = scan.next().charAt(0);
        ec = checkEnergyConsumption(ec);
        setEnergyConsumptionType(ec);

        System.out.print("Weigth: ");
        Double weigth = scan.nextDouble();
        setWeight(weigth);

        setPrice(1000);
    }

    public int finalPrice() {
        int priceByEC = priceByEnergyConsumption();
        int priceByWeight = priceByWeight();

        return priceByEC + priceByWeight + price;
    }

    private int priceByEnergyConsumption() {
        if (energyConsumptionType.equals('A')){
            return 1000;
        }
        if (energyConsumptionType.equals('B')){
            return 800;
        }
        if (energyConsumptionType.equals('C')){
            return 600;
        }
        if (energyConsumptionType.equals('D')){
            return 500;
        }
        if (energyConsumptionType.equals('E')){
            return 300;
        }

        return 100;
    }

    private int priceByWeight() {
        if (weight >= 1 && weight <= 19){
            return 100;
        }
        if (weight >= 20 && weight <= 49){
            return 500;
        }
        if (weight >= 50 && weight <= 79){
            return 800;
        }
        return 1000;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Character getEnergyConsumptionType() {
        return energyConsumptionType;
    }

    public void setEnergyConsumptionType(Character energyConsumptionType) {
        this.energyConsumptionType = energyConsumptionType;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Appliance{" +
                "price=" + price +
                ", color='" + color + '\'' +
                ", energyConsumptionType=" + energyConsumptionType +
                ", weight=" + weight +
                '}';
    }
}
