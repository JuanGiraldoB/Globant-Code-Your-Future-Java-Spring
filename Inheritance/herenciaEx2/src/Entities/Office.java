package Entities;

public class Office {

    private Integer workersPerFloor;
    private Integer floor;

    public Office() {
    }

    public Office(Integer workersPerFloor, Integer floor) {
        this.workersPerFloor = workersPerFloor;
        this.floor = floor;
    }

    public Integer getWorkersPerFloor() {
        return workersPerFloor;
    }

    public void setWorkersPerFloor(Integer workersPerFloor) {
        this.workersPerFloor = workersPerFloor;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }
}
