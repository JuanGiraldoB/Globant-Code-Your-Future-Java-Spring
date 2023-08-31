package Entities;

import java.util.*;

public class Simulator {


    public Simulator() {
    }

    public static String [] generateStudentsNames(int amountOfStudents) {
        String [] studentsListNames = new String[amountOfStudents];

        for (int i = 0; i < amountOfStudents; i++) {
            studentsListNames[i] = RandomGenerator.generateRandomWord(3, 10);
        }

        return  studentsListNames;
    }

    public static boolean doesDNIExist(int dniToCheck, int[] dniArray) {
        for (int dni : dniArray) {
            if (dni == dniToCheck) {
                return true; // DNI already exists
            }
        }
        return false; // DNI doesn't exist
    }

    public static int[] generateStudentsDNIs(int amountOfStudents) {
        int[] studentListDNIs = new int[amountOfStudents];

        for (int i = 0; i < amountOfStudents; i++) {
            int newDNI;
            do {
                newDNI = Integer.parseInt(RandomGenerator.generateRandomDNI(6, 8));
            } while (doesDNIExist(newDNI, studentListDNIs)); // Keep generating until a unique DNI is found

            studentListDNIs[i] = newDNI;
        }

        return studentListDNIs;
    }

    public static ArrayList<Student> createStudents(String [] names, int [] dnis) {
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            students.add(new Student(names[i], dnis[i]));
        }

        return students;
    }

    public static Vote voting(ArrayList<Student> students, Student student) {
        HashSet<Student> votedStudents = new HashSet<>();
        Random rand = new Random();
        int size = students.size();

        while (votedStudents.size() < 3) {
            int randomStudentPos = rand.nextInt(size);
            Student randomStudent = students.get(randomStudentPos);

            if (!votedStudents.contains(randomStudent) && !randomStudent.equals(student)) {
                votedStudents.add(randomStudent);
                randomStudent.setVotes(randomStudent.getVotes() + 1);
            }
        }

        return new Vote(student, votedStudents);
    }


    public static void showStudentVotes(ArrayList<Student> students) {
        students.forEach(System.out::println);
    }

    public static HashMap<String, ArrayList<Student>> createFacilitators(ArrayList<Student> students) {
        List<Student> facilitators = students.subList(0, 5);
        List<Student> alternateFacilitators = students.subList(5, 10);

        HashMap<String, ArrayList<Student>> facilitatorsMap = new HashMap<>();
        facilitatorsMap.put("facilitators", new ArrayList<>(facilitators));
        facilitatorsMap.put("alternateFacilitators", new ArrayList<>(alternateFacilitators));

        return facilitatorsMap;
    }



}
