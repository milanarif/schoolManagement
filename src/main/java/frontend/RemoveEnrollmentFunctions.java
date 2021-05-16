package frontend;

import backend.*;
import entity.*;
import main.Input;

public class RemoveEnrollmentFunctions {

    public static void removeCourseStudent() {

        System.out.print("Student SSN (YYYYMMDD-XXXX): ");
        String socialSecurity = Input.inputSSN();

        System.out.print("Course ID: ");
        Integer courseId = Input.inputInt();

        Enrollment enrollment = EnrollmentFunctions.removeCourse(socialSecurity, courseId);

        Student student = StudentFunctions.getStudent(socialSecurity);
        Course course = CourseFunctions.getCourse(courseId);

        if (student == null) {
            System.out.println("\nStudent Not Found!");
        } else if (course == null) {
            System.out.println("\nCourse Not Found!");
        } else {
            System.out.println("\nStudent " + socialSecurity + " Successfully Removed From Course " + courseId);
        }
    }

    public static void removeCourseTeacher() {

        System.out.print("Teacher SSN (YYYYMMDD-XXXX): ");
        String socialSecurity = Input.inputSSN();

        System.out.print("Course ID: ");
        Integer courseId = Input.inputInt();

        Teacher teacher = TeacherFunctions.removeCourse(socialSecurity, courseId);
        if (teacher == null) {
            System.out.println("\nTeacher Not Found!");
        } else if (teacher.getCourses().size() == 0) {
            System.out.println("\nTeacher " + socialSecurity + " Successfully Removed From Course " + courseId);
        } else {
            System.out.println("\nCourse Not Found!");
        }
    }

    public static void removeDepartmentStudent() {

        System.out.print("Student SSN (YYYYMMDD-XXXX): ");
        String socialSecurity = Input.inputSSN();

        StudentFunctions.removeDepartment(socialSecurity);

        if (StudentFunctions.getAllStudents().contains(socialSecurity)) {
            System.out.println("\nStudent " + socialSecurity + " Successfully Removed From Department");
        } else {
            System.out.println("\nStudent Not Found!");
        }
    }

    public static void removeDepartmentTeacher() {

        System.out.print("Teacher SSN (YYYYMMDD-XXXX): ");
        String socialSecurity = Input.inputSSN();

        TeacherFunctions.removeDepartment(socialSecurity);

        if (TeacherFunctions.getAllTeachers().contains(socialSecurity)) {
            System.out.println("\nTeacher " + socialSecurity + " Successfully Removed From Department");
        } else {
            System.out.println("\nTeacher Not Found!");
        }
    }
}
