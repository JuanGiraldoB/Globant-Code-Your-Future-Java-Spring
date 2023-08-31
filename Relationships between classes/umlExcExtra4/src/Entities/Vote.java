package Entities;

import java.util.HashSet;

public class Vote {

    private Student student;
    private final HashSet<Student> votedStudents;

    public Vote(Student student, HashSet<Student> votedStudents) {
        this.student = student;
        this.votedStudents = votedStudents;
    }

    @Override
    public String toString() {
        return "Vote{" +
                "student=" + student +
                ", votedStudents=" + votedStudents +
                '}';
    }
}
