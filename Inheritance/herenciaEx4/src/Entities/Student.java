package Entities;

import Enums.CivilStatusType;

public class Student extends Person{

    private Course course;

    public Student(String fullName, String id, CivilStatusType civilStatus, Course course) {
        super(fullName, id, civilStatus);
        this.course = course;
    }

    public void changeCourse(Course course){
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "course=" + course +
                ", fullName='" + fullName + '\'' +
                ", id='" + id + '\'' +
                ", civilStatus=" + civilStatus +
                '}';
    }
}
