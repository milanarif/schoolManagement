package frontend;

import backend.CourseFunctions;
import backend.DepartmentFunctions;
import backend.StudentFunctions;
import backend.TeacherFunctions;
import entity.Course;
import entity.Department;
import entity.Student;
import entity.Teacher;
import main.Input;

public class RemoveFunctions {

    public static void removeCourse(){

        System.out.print("Course ID: ");
        Integer courseId = Input.inputInt();

        if (CourseFunctions.getCourse(courseId) == null) {
            System.out.println("\nCourse " + courseId + " Not Found!");
        } else {
            System.out.println("\nCourse " + courseId + " Successfully Removed!");
            CourseFunctions.removeCourse(courseId);
        }
    }

    public static void removeStudent(){

        System.out.print("Student SSN (YYYYMMDD-XXXX): ");
        String socialSecurity = Input.inputSSN();

        if (StudentFunctions.getStudent(socialSecurity) == null) {
            System.out.println("\nStudent " + socialSecurity + " Not Found!");
        } else {
            System.out.println("\nStudent " + socialSecurity + " Successfully Removed!");
            StudentFunctions.removeStudent(socialSecurity);
        }
    }

    public static void removeTeacher(){

        System.out.print("Teacher SSN (YYYYMMDD-XXXX): ");
        String socialSecurity = Input.inputSSN();

        if (TeacherFunctions.getTeacher(socialSecurity) == null) {
            System.out.println("\nTeacher " + socialSecurity + " Not Found!");
        } else {
            System.out.println("\nTeacher " + socialSecurity + " Successfully Removed!");
            TeacherFunctions.removeTeacher(socialSecurity);
        }
    }

    public static void removeDepartment(){

        System.out.print("Department ID: ");
        Integer departmentId = Input.inputInt();

        if (DepartmentFunctions.getDepartment(departmentId) == null) {
            System.out.println("\nDepartment " + departmentId + " Not Found!");
        } else {
            System.out.println("\nDepartment " + departmentId + " Successfully Removed!");
            DepartmentFunctions.removeDepartment(departmentId);
        }
    }
}