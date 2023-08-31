package Entities.Accomodations;

import Entities.Person.Manager;

public class Household extends  ExtrahotelAccommodations{

    private Integer numRooms;
    private Boolean hasDiscount;
    private Boolean hasSportCenter;

    public Household(String name, String address, String location, Manager manager, boolean isPrivate, Double area, Integer numRooms, Boolean hasDiscount, Boolean hasSportCenter) {
        super(name, address, location, manager, isPrivate, area);
        this.numRooms = numRooms;
        this.hasDiscount = hasDiscount;
        this.hasSportCenter = hasSportCenter;
    }

    public Integer getNumRooms() {
        return numRooms;
    }

    public void setNumRooms(Integer numRooms) {
        this.numRooms = numRooms;
    }

    public Boolean getHasDiscount() {
        return hasDiscount;
    }

    public void setHasDiscount(Boolean hasDiscount) {
        this.hasDiscount = hasDiscount;
    }

    public Boolean getHasSportCenter() {
        return hasSportCenter;
    }

    public void setHasSportCenter(Boolean hasSportCenter) {
        this.hasSportCenter = hasSportCenter;
    }

    @Override
    public String toString() {
        return "Household{" +
                "numRooms=" + numRooms +
                ", hasDiscount=" + hasDiscount +
                ", hasSportCenter=" + hasSportCenter +
                ", isPrivate=" + isPrivate +
                ", area=" + area +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", location='" + location + '\'' +
                ", manager=" + manager +
                '}';
    }
}
