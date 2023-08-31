import Entities.Appliance;
import Entities.TV;
import Entities.WashingMachine;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Appliance> appliances = new ArrayList<>();

        WashingMachine wm = new WashingMachine();
        wm.createWashingMachine();
        appliances.add(wm);

        TV tv = new TV();
        tv.createTV();
        appliances.add(tv);

        int totalCostApplicance = 0;
        int totalCostWashingMachine = 0;
        int totalCostTV = 0;


        for (Appliance aux :
                appliances) {
            if (aux instanceof WashingMachine) {
                totalCostWashingMachine += aux.getPrice();
            }

            if (aux instanceof TV) {
                totalCostTV += aux.getPrice();
            }
        }

        totalCostApplicance = totalCostWashingMachine + totalCostTV;

        System.out.println(totalCostApplicance);
        System.out.println(totalCostWashingMachine);
        System.out.println(totalCostTV);

    }
}
