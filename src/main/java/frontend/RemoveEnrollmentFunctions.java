package frontend;

import backend.*;
import dao.CourseDao;
import dao.CourseDaoImpl;
import entity.Course;
import entity.Enrollment;
import entity.Student;
import entity.Teacher;
import main.Input;

import java.util.List;


public class RemoveEnrollmentFunctions {

    public static void removeCourseStudent() {

        System.out.print("Student Social Security: ");
        String socialSecurity = Input.inputString();

        System.out.print("Course id: ");
        Integer courseId = Input.inputInt();

        EnrollmentFunctions.removeCourse(socialSecurity, courseId);
    }

    public static void removeCourseTeacher() {

        System.out.print("Teacher Social Security: ");
        String socialSecurity = Input.inputString();

        System.out.print("Course id: ");
        Integer courseId = Input.inputInt();

        CourseFunctions.removeTeacher(socialSecurity, courseId);
    }

    public static void removeDepartmentStudent() {

        System.out.print("Student Social Security: ");
        String socialSecurity = Input.inputString();

        System.out.print("Department id: ");
        Integer departmentId = Input.inputInt();

        //StudentFunctions.setDepartment()
    }

    public static void removeDepartmentTeacher() {

        System.out.print("Teacher Social Security: ");
        String socialSecurity = Input.inputString();

        System.out.print("Department id: ");
        Integer departmentId = Input.inputInt();

    }
}
