import Entities.Course;
import Entities.ServiceStaff;
import Entities.Student;
import Entities.Teacher;
import Enums.CivilStatusType;
import Enums.DepartmentType;
import Enums.SectionType;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course course = new Course(35, "Algorithms", 50);
        Student student = new Student("Juan", "10530548", CivilStatusType.SINGLE, course);
        Teacher teacher = new Teacher("Carlos", "4156413", CivilStatusType.MARRIED, LocalDate.now(), 5, DepartmentType.LANGUAGE);
        ServiceStaff serviceStaff = new ServiceStaff("maria", "156406",CivilStatusType.DIVORCED,LocalDate.now(),1, SectionType.RESTAURANT);

//        Person test
        System.out.println(student.getCivilStatus());
        student.changeCivilStattus(CivilStatusType.MARRIED);
        System.out.println(student.getCivilStatus());

        System.out.println();
        System.out.println();

//        Employee test
        System.out.println(teacher.getOfficeNumber());
        teacher.changeOfficeNumber(9);
        System.out.println(teacher.getOfficeNumber());

        System.out.println();
        System.out.println();

//        Student test
        System.out.println(student.getCourse());
        Course course1 = new Course(20, "DS", 30);
        student.changeCourse(course1);
        System.out.println(student.getCourse());

        System.out.println();
        System.out.println();

//        Teacher test
        System.out.println(teacher.getDepartment());
        teacher.changeDepartment(DepartmentType.MATH);
        System.out.println(teacher.getDepartment());

        System.out.println();
        System.out.println();

//        ServiceStaff test
        System.out.println(serviceStaff.getSection());
        serviceStaff.changeSection(SectionType.GYM);
        System.out.println(serviceStaff.getSection());

    }
}
