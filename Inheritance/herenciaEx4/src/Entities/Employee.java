package Entities;

import Enums.CivilStatusType;

import java.time.LocalDate;

public abstract class Employee extends  Person{

    protected LocalDate incorporationDate;
    protected Integer officeNumber;

    public Employee(String fullName, String id, CivilStatusType civilStatus, LocalDate incorporationDate, Integer officeNumber) {
        super(fullName, id, civilStatus);
        this.incorporationDate = incorporationDate;
        this.officeNumber = officeNumber;
    }

    public void changeOfficeNumber(int officeNumber){
        this.officeNumber = officeNumber;
    }

    public LocalDate getIncorporationDate() {
        return incorporationDate;
    }

    public void setIncorporationDate(LocalDate incorporationDate) {
        this.incorporationDate = incorporationDate;
    }

    public Integer getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(Integer officeNumber) {
        this.officeNumber = officeNumber;
    }
}
