package Entities;

import java.util.Comparator;
import java.util.Objects;

public class Student {
    private String name;
    private Integer DNI;
    private Integer votes;

    public Student(String name, Integer DNI) {
        this.name = name;
        this.DNI = DNI;
        votes = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public Integer getVotes() {
        return votes;
    }

    public void setVotes(Integer votes) {
        this.votes = votes;
    }

    public static Comparator<Student> compareVotes = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o2.getVotes().compareTo(o1.getVotes());
        }
    };

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return Objects.equals(getName(), student.getName()) && Objects.equals(getDNI(), student.getDNI());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDNI());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", DNI='" + DNI + '\'' +
                ", votes=" + votes +
                '}';
    }
}
