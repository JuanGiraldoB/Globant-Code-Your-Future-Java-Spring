import Entities.Accomodations.*;
import Entities.Person.Manager;
import Enums.GymType;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant(30, "Dominos");
        Manager manager = new Manager("Juan", 24, 200_000d);
        Gym gym = new Gym(GymType.B);

        FourStarHotel fosh = new FourStarHotel("RocketHouse", "Cra 12A #65-195", "Sultana", manager, 50, 100, 10, gym,restaurant);
        FiveStarHotel fish = new FiveStarHotel("MaxHouse", "somewhere", "Palermo", manager, 100, 300, 20, gym, restaurant, 10, 20, 10);

        ArrayList<Hotel> hotels = new ArrayList<>();
        hotels.add(fosh);
        hotels.add(fish);

        hotels.sort(Hotel.comparePrice);
    }

}
