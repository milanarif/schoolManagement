package frontend;

import backend.*;
import main.Input;

public class RemoveEnrollmentFunctions {

    public static void removeCourseStudent() {

        System.out.print("Student SSN (YYYYMMDD-XXXX): ");
        String socialSecurity = Input.inputSSN();

        System.out.print("Course ID: ");
        Integer courseId = Input.inputInt();

        if (StudentFunctions.getStudent(socialSecurity) == null) {
            System.out.println("\nStudent Not Found!");
        } else if (CourseFunctions.getCourse(courseId) == null) {
            System.out.println("\nCourse Not Found!");
        } else {
            System.out.println("\nStudent " + socialSecurity + " Successfully Removed From Course " + courseId);
            EnrollmentFunctions.removeCourse(socialSecurity, courseId);
        }
    }

    public static void removeCourseTeacher() {

        System.out.print("Teacher SSN (YYYYMMDD-XXXX): ");
        String socialSecurity = Input.inputSSN();

        System.out.print("Course ID: ");
        Integer courseId = Input.inputInt();

        if (TeacherFunctions.getTeacher(socialSecurity) == null) {
            System.out.println("\nTeacher Not Found!");
        } else if (CourseFunctions.getCourse(courseId) == null) {
            System.out.println("\nCourse Not Found!");
        } else {
            System.out.println("\nTeacher " + socialSecurity + " Successfully Removed From Course " + courseId);
            TeacherFunctions.removeCourse(socialSecurity, courseId);
        }
    }

    public static void removeDepartmentStudent() {

        System.out.print("Student SSN (YYYYMMDD-XXXX): ");
        String socialSecurity = Input.inputSSN();

        if (StudentFunctions.getStudent(socialSecurity) == null) {
            System.out.println("\nStudent Not Found!");
        } else {
            System.out.println("\nStudent " + socialSecurity + " Successfully Removed From Department");
            StudentFunctions.removeDepartment(socialSecurity);
        }
    }

    public static void removeDepartmentTeacher() {

        System.out.print("Teacher SSN (YYYYMMDD-XXXX): ");
        String socialSecurity = Input.inputSSN();

        if (TeacherFunctions.getTeacher(socialSecurity) == null) {
            System.out.println("\nTeacher Not Found!");
        } else {
            System.out.println("\nTeacher " + socialSecurity + " Successfully Removed From Department");
            TeacherFunctions.removeDepartment(socialSecurity);
        }
    }
}
