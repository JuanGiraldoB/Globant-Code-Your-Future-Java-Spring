package Entities.Accomodations;

import Entities.Person.Manager;

import java.util.Comparator;

public abstract class Hotel extends Accomodation {

    protected final Integer BASE_PRICE = 50;
    protected Integer numRooms;
    protected Integer numBeds;
    protected Integer numFloors;
    protected Double roomPrice;
    protected Gym gymType;
    protected Restaurant restaurant;

    public Hotel(String name, String address, String location, Manager manager, Integer numRooms, Integer numBeds, Integer numFloors, Gym gymType, Restaurant restaurant) {
        super(name, address, location, manager);
        this.numRooms = numRooms;
        this.numBeds = numBeds;
        this.numFloors = numFloors;
        this.gymType = gymType;
        this.restaurant = restaurant;
//        this.roomPrice = calcualteRoomprice();
    }

    public static Comparator<Hotel> comparePrice = new Comparator<Hotel>() {
        @Override
        public int compare(Hotel o1, Hotel o2) {
            return o2.getRoomPrice().compareTo(o1.getRoomPrice());
        }
    };

    public abstract double calcualteRoomprice();

    public Integer getNumRooms() {
        return numRooms;
    }

    public void setNumRooms(Integer numRooms) {
        this.numRooms = numRooms;
    }

    public Integer getNumBeds() {
        return numBeds;
    }

    public void setNumBeds(Integer numBeds) {
        this.numBeds = numBeds;
    }

    public Integer getNumFloors() {
        return numFloors;
    }

    public void setNumFloors(Integer numFloors) {
        this.numFloors = numFloors;
    }

    public Double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(Double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public Gym getGymType() {
        return gymType;
    }

    public void setGymType(Gym gymType) {
        this.gymType = gymType;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}

