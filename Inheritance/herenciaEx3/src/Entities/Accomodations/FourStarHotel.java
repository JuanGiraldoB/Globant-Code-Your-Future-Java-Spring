package Entities.Accomodations;

import Entities.Person.Manager;

public class FourStarHotel extends Hotel{
    public FourStarHotel(String name, String address, String location, Manager manager, Integer numRooms, Integer numBeds, Integer numFloors, Gym gym, Restaurant restaurant) {
        super(name, address, location, manager, numRooms, numBeds, numFloors, gym, restaurant);
        roomPrice = calcualteRoomprice();
    }

    @Override
    public double calcualteRoomprice() {
        int restaurantPrice = restaurant.getPrice();
        int gymPrice = gymType.getPrice();

        return BASE_PRICE + numRooms + restaurantPrice + gymPrice;
    }

    @Override
    public String toString() {
        return "FourStarHotel{" +
                "BASE_PRICE=" + BASE_PRICE +
                ", numRooms=" + numRooms +
                ", numBeds=" + numBeds +
                ", numFloors=" + numFloors +
                ", roomPrice=" + roomPrice +
                ", gymType=" + gymType +
                ", restaurant=" + restaurant +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", location='" + location + '\'' +
                ", manager=" + manager +
                '}';
    }
}
