package Entities;

import Enums.CivilStatusType;
import Enums.DepartmentType;

import java.time.LocalDate;

public class Teacher extends Employee{

    private DepartmentType department;

    public Teacher(String fullName, String id, CivilStatusType civilStatus, LocalDate incorporationDate, Integer officeNumber, DepartmentType department) {
        super(fullName, id, civilStatus, incorporationDate, officeNumber);
        this.department = department;
    }

    public void changeDepartment(DepartmentType department){
        this.department = department;
    }

    public DepartmentType getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentType department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "department=" + department +
                ", incorporationDate=" + incorporationDate +
                ", officeNumber=" + officeNumber +
                ", fullName='" + fullName + '\'' +
                ", id='" + id + '\'' +
                ", civilStatus=" + civilStatus +
                '}';
    }
}
