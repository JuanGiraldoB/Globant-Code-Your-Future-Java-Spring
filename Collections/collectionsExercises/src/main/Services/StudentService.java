package main.Services;

import main.Entities.Student;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class StudentService {

    private ArrayList<Student> students;
    private Scanner scan;

    public StudentService() {
        this.students = new ArrayList<Student>();
        this.scan = new Scanner(System.in);
    }

    public Student createStudent() {
        System.out.print("Name: ");
        String name = scan.next();

        ArrayList<Integer> notes = new ArrayList<>(3);

        for (int i = 1; i < 4; i++) {
            System.out.print("Note " + i + ": ");
            notes.add(scan.nextInt());
        }

        return new Student(name, notes);
    }

    public Student getStudentByName(String studentName) {
        for (Student student :
                students) {
            if (student.getName().equalsIgnoreCase(studentName)){
                return student;
            }
        }

        return null;
    }

    public Double finalNote(Student student) {
        ArrayList<Integer> notes = student.getNotes();
        Double finalNote = 0.0;

        for (int i = 0; i < notes.size(); i++) {
            finalNote += notes.get(i);
        }

        // Calculate the average
        finalNote = finalNote / notes.size();

        return finalNote;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void printStudents() {
        students.forEach(student -> System.out.println(student));
    }
}
