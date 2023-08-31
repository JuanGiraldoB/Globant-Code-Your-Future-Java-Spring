import Entities.Simulator;
import Entities.Student;
import Entities.Vote;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String [] studentsNames = Simulator.generateStudentsNames(15);
        int [] studentsDNIs = Simulator.generateStudentsDNIs(15);

        ArrayList<Student> students = Simulator.createStudents(studentsNames, studentsDNIs);

        ArrayList<Vote> votes = new ArrayList<>();
        students.forEach((student -> votes.add(Simulator.voting(students, student))));

        Simulator.showStudentVotes(students);
        votes.forEach(System.out::println);

        students.sort(Student.compareVotes);
        System.out.println(Simulator.createFacilitators(students));
    }
}
