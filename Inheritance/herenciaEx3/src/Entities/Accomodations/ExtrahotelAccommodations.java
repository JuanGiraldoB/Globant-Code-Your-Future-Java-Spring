package Entities.Accomodations;

import Entities.Person.Manager;

public abstract class ExtrahotelAccommodations extends Accomodation {

    protected boolean isPrivate;
    protected Double area;

    public ExtrahotelAccommodations(String name, String address, String location, Manager manager, boolean isPrivate, Double area) {
        super(name, address, location, manager);
        this.isPrivate = isPrivate;
        this.area = area;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }
}
