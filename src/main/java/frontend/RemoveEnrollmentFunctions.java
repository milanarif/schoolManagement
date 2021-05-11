package frontend;

import backend.EnrollmentFunctions;
import main.Input;

public class RemoveEnrollmentFunctions {

    public static void removeCourseStudent() {

        System.out.print("Enrollment id: ");
        Integer enrollmentId = Input.inputInt();

        System.out.print("Course id: ");
        Integer courseId = Input.inputInt();

        EnrollmentFunctions.removeCourse(enrollmentId, courseId);
    }

    public static void removeCourseTeacher() {

    }

    public static void removeDepartmentStudent() {

    }

    public static void removeDepartmentTeacher() {

    }
}
