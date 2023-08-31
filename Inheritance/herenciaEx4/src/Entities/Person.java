package Entities;

import Enums.CivilStatusType;

public abstract class Person {
    protected String fullName;
    protected String id;
    protected CivilStatusType civilStatus;

    public Person(String fullName, String id, CivilStatusType civilStatus) {
        this.fullName = fullName;
        this.id = id;
        this.civilStatus = civilStatus;
    }

    public void changeCivilStattus(CivilStatusType civilStatus){
        this.civilStatus = civilStatus;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CivilStatusType getCivilStatus() {
        return civilStatus;
    }

    public void setCivilStatus(CivilStatusType civilStatus) {
        this.civilStatus = civilStatus;
    }
}
