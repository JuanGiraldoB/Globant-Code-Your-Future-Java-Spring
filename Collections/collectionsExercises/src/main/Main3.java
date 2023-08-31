package main;

import main.Entities.Student;
import main.Services.StudentService;

public class Main3 {
    public static void main(String[] args) {
        StudentService ss = new StudentService();
        Student student = ss.createStudent();
        ss.addStudent(student);
        ss.printStudents();
        student = ss.getStudentByName("Juan");

        if (student != null) {
            System.out.println(ss.finalNote(student));
        }
    }
}
