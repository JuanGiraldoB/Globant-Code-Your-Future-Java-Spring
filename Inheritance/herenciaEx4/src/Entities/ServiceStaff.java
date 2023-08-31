package Entities;

import Enums.CivilStatusType;
import Enums.SectionType;

import java.time.LocalDate;

public class ServiceStaff extends  Employee{

    private SectionType section;

    public ServiceStaff(String fullName, String id, CivilStatusType civilStatus, LocalDate incorporationDate, Integer officeNumber, SectionType section) {
        super(fullName, id, civilStatus, incorporationDate, officeNumber);
        this.section = section;
    }

    public void changeSection(SectionType section){
        this.section = section;
    }

    public SectionType getSection() {
        return section;
    }

    public void setSection(SectionType section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "ServiceStaff{" +
                "section=" + section +
                ", incorporationDate=" + incorporationDate +
                ", officeNumber=" + officeNumber +
                ", fullName='" + fullName + '\'' +
                ", id='" + id + '\'' +
                ", civilStatus=" + civilStatus +
                '}';
    }
}
