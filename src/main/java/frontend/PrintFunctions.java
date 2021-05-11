package frontend;

import backend.StudentFunctions;
import entity.*;

import java.util.List;

public class PrintFunctions {

    public static void printStudentHead(List <Student> student){
        System.out.println("\nStudent ID       Student Name        Credits   Gender    Department");
        System.out.println("--------------   -----------------   -------   -------   -----------");
        student.forEach(PrintFunctions::printStudent);
    }

    public static void printStudentHeadSearch(Student s){
        System.out.println("\nStudent ID       Student Name        Credits   Gender    Department");
        System.out.println("--------------   -----------------   -------   -------   -----------");
        printStudent(s);
    }

    public static void printStudent(Student s){
        System.out.printf("%-17s", s.getSocialSecurity());
        System.out.printf("%-20s", s.getName());
        System.out.printf("%-10.2f", StudentFunctions.getCredits(s.getSocialSecurity()));
        System.out.printf("%-10s", s.getGender());
        System.out.printf("%-13s", s.getDepartment());
        System.out.println(" ");
    }

    public static void printTeacherHead(List<Teacher> teacher) {
        System.out.println("\nTeacher ID       Teacher Name        Gender    Courses         Department");
        System.out.println("--------------   -----------------   -------   --------------  -----------");
        teacher.forEach(PrintFunctions::printTeacher);
    }

    public static void printTeacherHeadSearch(Teacher t) {
        System.out.println("\nTeacher ID       Teacher Name        Gender    Courses         Department");
        System.out.println("--------------   -----------------   -------   --------------  -----------");
        printTeacher(t);
    }

    public static void printTeacher(Teacher t){
        System.out.printf("%-17s", t.getSocialSecurity());
        System.out.printf("%-20s", t.getName());
        System.out.printf("%-10s", t.getGender());
        System.out.printf("%-16s", t.getCourses());
        System.out.printf("%-10s", t.getDepartment());
        System.out.println(" ");
    }

    public static void printCourseHead(List<Course> course) {
        System.out.println("\nID      Course Name         Credits");
        System.out.println("-----   -----------------   -------");
        course.forEach(PrintFunctions::printCourse);
    }

    public static void printCourseHeadSearch(Course c) {
        System.out.println("\nID      Course Name         Credits");
        System.out.println("-----   -----------------   -------");
        printCourse(c);
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

    public static void printDepartmentHeadSearch(Department d) {
        System.out.println("\nID      Department Name");
        System.out.println("-----   --------------");
        printDepartment(d);
    }

    private static void printDepartment(Department d) {
        System.out.printf("%-8d", d.getDepartmentId());
        System.out.printf("%-20s", d.getName());
        System.out.println(" ");
    }
}
