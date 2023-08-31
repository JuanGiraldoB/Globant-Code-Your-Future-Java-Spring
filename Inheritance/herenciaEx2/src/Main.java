import Entities.Building;
import Entities.OfficeBuilding;
import Entities.SportsCenter;
import Enums.SportsCenterType;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        OfficeBuilding b1 = new OfficeBuilding(2d,1d, 3d, 10, 10);
        OfficeBuilding b2 = new OfficeBuilding(4d, 5d, 3d, 5, 3);

        SportsCenter sc1 = new SportsCenter(2d,10d, 3d,"Rocket", SportsCenterType.OPEN);
        SportsCenter sc2 = new SportsCenter(4d, 25d, 3d,"Max", SportsCenterType.CLOSED);

        ArrayList<Building> building = new ArrayList<>();
        building.add(b1);
        building.add(b2);
        building.add(sc1);
        building.add(sc2);

        int openAmount = 0;
        int closedAmount = 0;

        for (Building building1 : building) {
            System.out.println(building1.calculateSurface());
            System.out.println(building1.calculateVolume());

            if (building1 instanceof SportsCenter) {
                SportsCenterType sct = ((SportsCenter) building1).getSportsCenterType();

                if (sct.equals(SportsCenterType.OPEN)) {
                    openAmount++;
                } else {
                    closedAmount++;
                }
            } else {
                OfficeBuilding ob = (OfficeBuilding) building1;
                System.out.println(ob.workersAmount());
            }
        }

        System.out.println(openAmount);
        System.out.println(closedAmount);
    }


}
