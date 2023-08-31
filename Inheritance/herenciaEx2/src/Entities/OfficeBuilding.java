package Entities;

import java.util.ArrayList;
import java.util.HashMap;

public class OfficeBuilding extends Building {

    private Integer workersPerOffice;
    private Integer numberOfFloors;
    private Office [] offices;

    public OfficeBuilding(Double width, Double height, Double length, Integer workersPerOffice, Integer numberOfFloors) {
        super(width, height, length);
        this.workersPerOffice = workersPerOffice;
        this.numberOfFloors = numberOfFloors;
    }

    public void createOffices(){
        for (int i = 0; i < offices.length; i++) {
            offices[i] = new Office(workersPerOffice, i);
        }
    }

    public HashMap<String, Integer> workersAmount(){
        int workersPerFloor = workersPerOffice;
        int totalWorkers = workersPerOffice * numberOfFloors;

        HashMap<String, Integer> workers = new HashMap<>();
        workers.put("Office", workersPerFloor);
        workers.put("building", totalWorkers);

        return workers;
    }

    @Override
    public double calculateSurface() {
        return 2 * (length * width + length * height + width * height);
    }

    @Override
    public double calculateVolume() {
        return length * width * height;
    }

    public Integer getWorkersPerOffice() {
        return workersPerOffice;
    }

    public void setWorkersPerOffice(Integer workersPerOffice) {
        this.workersPerOffice = workersPerOffice;
    }

    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(Integer numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public Office[] getOffices() {
        return offices;
    }

    public void setOffices(Office[] offices) {
        this.offices = offices;
    }
}
