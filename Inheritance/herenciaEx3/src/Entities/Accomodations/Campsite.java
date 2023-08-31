package Entities.Accomodations;

import Entities.Person.Manager;

public class Campsite extends ExtrahotelAccommodations{
    private Integer numTents;
    private Integer numBathrooms;
    private Restaurant restaurant;


    public Campsite(String name, String address, String location, Manager manager, boolean isPrivate, Double area, Integer numTents, Integer numBathrooms) {
        super(name, address, location, manager, isPrivate, area);
        this.numTents = numTents;
        this.numBathrooms = numBathrooms;
        restaurant = null;
    }

    public Campsite(String name, String address, String location, Manager manager, boolean isPrivate, Double area, Integer numTents, Integer numBathrooms, Restaurant restaurant) {
        super(name, address, location, manager, isPrivate, area);
        this.numTents = numTents;
        this.numBathrooms = numBathrooms;
        this.restaurant = restaurant;
    }

    public Integer getNumTents() {
        return numTents;
    }

    public void setNumTents(Integer numTents) {
        this.numTents = numTents;
    }

    public Integer getNumBathrooms() {
        return numBathrooms;
    }

    public void setNumBathrooms(Integer numBathrooms) {
        this.numBathrooms = numBathrooms;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        return "Campsite{" +
                "numTents=" + numTents +
                ", numBathrooms=" + numBathrooms +
                ", restaurant=" + restaurant +
                ", isPrivate=" + isPrivate +
                ", area=" + area +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", location='" + location + '\'' +
                ", manager=" + manager +
                '}';
    }
}

