package frontend;

import backend.*;
import entity.Department;
import entity.Enrollment;
import entity.Student;
import entity.Teacher;
import main.Input;



public class RemoveEnrollmentFunctions {

    public static void removeCourseStudent() {

        System.out.print("Student Social Security: ");
        String socialSecurity = Input.inputSSN();

        System.out.print("Course id: ");
        Integer courseId = Input.inputInt();

        EnrollmentFunctions.removeCourse(socialSecurity, courseId);

        //TODO add if statements?
    }

    public static void removeCourseTeacher() {

        System.out.print("Teacher Social Security: ");
        String socialSecurity = Input.inputSSN();

        System.out.print("Course id: ");
        Integer courseId = Input.inputInt();

        Teacher teacher = TeacherFunctions.removeCourse(socialSecurity, courseId);
        if (teacher == null) {
            System.out.println("\nTeacher Not Found!");
        } else if (teacher.getCourses().size() == 0) {
            System.out.println("\nCourse ("+ courseId +") Successfully Removed From Teacher!");
        } else {
            System.out.println("\nCourse Not Found!");
        }
    }

    public static void removeDepartmentStudent() {

        System.out.print("Student Social Security: ");
        String socialSecurity = Input.inputSSN();

        StudentFunctions.removeDepartment(socialSecurity);

        if (StudentFunctions.getAllStudents().contains(socialSecurity)) {
            System.out.println("\nStudent Successfully Removed From Department");
        } else {
            System.out.println("\nStudent Not Found!");
        }
    }

    public static void removeDepartmentTeacher() {

        System.out.print("Teacher Social Security: ");
        String socialSecurity = Input.inputSSN();

        TeacherFunctions.removeDepartment(socialSecurity);

        if (TeacherFunctions.getAllTeachers().contains(socialSecurity)) {
            System.out.println("\nTeacher Successfully Removed From Department");
        } else {
            System.out.println("\nTeacher Not Found!");
        }
    }
}
