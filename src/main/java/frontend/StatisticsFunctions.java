package frontend;

import backend.StudentFunctions;
import backend.TeacherFunctions;
import entity.Student;
import entity.Teacher;

import java.util.List;

public class StatisticsFunctions {

    public static void passRatio() {

        //TODO passRatio
    }

    public static void genderRatio() {

        //TODO genderRatio
        //TODO use check valid socialSecurity format to calculate gender?
    }

    public static void averageAge() {

        //TODO averageAge from socialSecurity nr??
    }

    public static void numberOfPerson() {

        List<Student> student = StudentFunctions.getAllStudents();
        List<Teacher> teacher = TeacherFunctions.getAllTeachers();

        int s = student.size();

        int t = teacher.size();

        Integer total = s + t;

        System.out.println("\nStudents  Teachers  Total");
        System.out.println("--------  --------  -------");
        System.out.printf("%-10d", s);
        System.out.printf("%-10d", t);
        System.out.printf("%-10d", total);
        System.out.println(" ");
    }


}
