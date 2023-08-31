package Entities.Accomodations;

import Entities.Person.Manager;

public class Accomodation {

    protected String name;
    protected String address;
    protected String location;
    protected Manager manager;

    public Accomodation() {
    }

    public Accomodation(String name, String address, String location, Manager manager) {
        this.name = name;
        this.address = address;
        this.location = location;
        this.manager = manager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
