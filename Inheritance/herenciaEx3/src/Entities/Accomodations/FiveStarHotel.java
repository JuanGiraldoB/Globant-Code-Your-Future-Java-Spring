package Entities.Accomodations;

import Entities.Person.Manager;

public class FiveStarHotel extends Hotel{

    private Integer numConferenceRooms;
    private Integer numSuites;
    private Integer numLimos;

    public FiveStarHotel(String name, String address, String location, Manager manager, Integer numRooms, Integer numBeds, Integer numFloors, Gym gym, Restaurant restaurant, Integer numConferenceRooms, Integer numSuites, Integer numLimos) {
        super(name, address, location, manager, numRooms, numBeds, numFloors, gym, restaurant);
        this.numConferenceRooms = numConferenceRooms;
        this.numSuites = numSuites;
        this.numLimos = numLimos;
        roomPrice = calcualteRoomprice();
    }

    @Override
    public double calcualteRoomprice() {
        int restaurantPrice = restaurant.getPrice();
        int gymPrice = gymType.getPrice();

        return BASE_PRICE + numRooms + restaurantPrice + gymPrice + 15 * numLimos;
    }

    public Integer getNumConferenceRooms() {
        return numConferenceRooms;
    }

    public void setNumConferenceRooms(Integer numConferenceRooms) {
        this.numConferenceRooms = numConferenceRooms;
    }

    public Integer getNumSuites() {
        return numSuites;
    }

    public void setNumSuites(Integer numSuites) {
        this.numSuites = numSuites;
    }

    public Integer getNumLimos() {
        return numLimos;
    }

    public void setNumLimos(Integer numLimos) {
        this.numLimos = numLimos;
    }

    @Override
    public String toString() {
        return "FiveStarHotel{" +
                "numConferenceRooms=" + numConferenceRooms +
                ", numSuites=" + numSuites +
                ", numLimos=" + numLimos +
                ", BASE_PRICE=" + BASE_PRICE +
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
