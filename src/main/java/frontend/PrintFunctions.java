package frontend;

import backend.StudentFunctions;
import entity.*;

import java.util.List;

public class PrintFunctions {
    public static void printCourseWithHead(Course c){
        System.out.println("\nID      Course Name         Credits");
        System.out.println("-----   -----------------   -------");
        System.out.printf("%-8d", c.getCourseId());
        System.out.printf("%-20s", c.getName());
        System.out.printf("%-6s", c.getCredits());
        System.out.println(" ");
    }

    public static void printOnlyStudentHead(){
        System.out.println("\nStudent SSN       Student Name        Credits   Gender    Department");
        System.out.println("---------------   -----------------   -------   -------   -----------");

    }




    public static void printStudentHead(List <Student> student){
        System.out.println("\nStudent SSN       Student Name        Credits   Gender    Department");
        System.out.println("---------------   -----------------   -------   -------   -----------");
        student.forEach(PrintFunctions::printStudent);
    }

    public static void printStudent(Student s){
        System.out.printf("%-18s", s.getSocialSecurity().substring(2,8) + "-" + s.getSocialSecurity().substring(8,12));
        System.out.printf("%-20s", s.getName());
        System.out.printf("%-10.2f", StudentFunctions.getCredits(s.getSocialSecurity()));
        System.out.printf("%-10s", s.getGender());
        if (s.getDepartment() == null) {
            System.out.printf("%-10s", "-");
        } else {
            System.out.printf("%-10s", s.getDepartment());
        }
        System.out.println(" ");
    }

    public static void printTeacherHead(List<Teacher> teacher) {
        System.out.println("\nTeacher SSN       Teacher Name        Gender    Department");
        System.out.println("---------------   -----------------   -------   -----------");

        teacher.forEach(PrintFunctions::printTeacher);
    }

    public static void printTeacher(Teacher t){
        System.out.printf("%-18s", t.getSocialSecurity().substring(2,8) + "-" + t.getSocialSecurity().substring(8,12));
        System.out.printf("%-20s", t.getName());
        System.out.printf("%-10s", t.getGender());

        if (t.getDepartment() == null) {
            System.out.printf("%-10s", "-");
        } else {
            System.out.printf("%-10s", t.getDepartment());
        }
        System.out.println(" ");
    }

    public static void printCourseHead(List<Course> course) {
        System.out.println("\nID      Course Name         Credits");
        System.out.println("-----   -----------------   -------");
        course.forEach(PrintFunctions::printCourse);
    }

    private static void printCourse(Course c) {
        System.out.printf("%-8d", c.getCourseId());
        System.out.printf("%-20s", c.getName());
        System.out.printf("%-6s", c.getCredits());
        System.out.println(" ");
    }

    public static void printDepartmentHead(List<Department> department) {
        System.out.println("\nID      Department Name");
        System.out.println("-----   --------------");
        department.forEach(PrintFunctions::printDepartment);
    }

    private static void printDepartment(Department d) {
        System.out.printf("%-8d", d.getDepartmentId());
        System.out.printf("%-20s", d.getName());
        System.out.println(" ");
    }
}
