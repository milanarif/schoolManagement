package frontend;

import backend.CourseFunctions;
import backend.DepartmentFunctions;
import backend.StudentFunctions;
import backend.TeacherFunctions;
import entity.Course;
import entity.Department;
import main.Input;

import java.util.List;

public class UpdateFunctions {

    public static void updateCourse() {

        System.out.print("Course id: ");
        Integer courseId = Input.inputInt();

        System.out.print("New course name: ");
        String newName = Input.inputString();

        boolean uniqueCourse = false;
        List<Course> courses = CourseFunctions.getAllCourses();
        for (Course c : courses) {
            uniqueCourse = c.getName().equals(newName);
        }
        if (uniqueCourse) {
            System.out.println("\nCourse named " + newName + " already exists!");
        } else if (CourseFunctions.getCourse(courseId) == null) {
            System.out.println("\nCourse " + courseId + " Not Found!");
        } else {
            System.out.println("\nCourse " + newName + " Successfully Updated!");
            CourseFunctions.setName(courseId, newName);
        }
    }

    public static void updateStudent() {

        System.out.print("Student SSN (YYYYMMDD-XXXX): ");
        String socialSecurity = Input.inputSSN();

        System.out.print("New Student Name: ");
        String newName = Input.inputString();

        if (StudentFunctions.getStudent(socialSecurity) == null) {
            System.out.println("\nStudent " + socialSecurity + " Not Found!");
        } else {
            System.out.println("\nStudent " + socialSecurity + " Successfully Updated To " + newName + "!");
            StudentFunctions.setName(socialSecurity, newName);
        }
    }

    public static void updateTeacher() {

        System.out.print("Teacher SSN (YYYYMMDD-XXXX): ");
        String socialSecurity = Input.inputSSN();

        System.out.print("New Teacher Name: ");
        String newName = Input.inputString();

        if (TeacherFunctions.getTeacher(socialSecurity) == null) {
            System.out.println("\nTeacher " + socialSecurity + " Not Found!");
        } else {
            System.out.println("\nTeacher " + socialSecurity + " Successfully Updated To " + newName + "!");
            TeacherFunctions.setName(socialSecurity, newName);
        }
    }

    public static void updateDepartment() {

        System.out.print("Department ID: ");
        Integer departmentId = Input.inputInt();

        System.out.print("New Department Name: ");
        String newName = Input.inputString();

        boolean uniqueDepartment = false;
        List<Department> departments = DepartmentFunctions.getAllDepartments();
        for (Department d : departments) {
            uniqueDepartment = d.getName().equals(newName);
        }
        if (uniqueDepartment) {
            System.out.println("\nDepartment named " + newName + " already exists!");
        } else if (DepartmentFunctions.getDepartment(departmentId) == null) {
            System.out.println("\nDepartment " + departmentId + " Not Found!");
        } else {
            System.out.println("\nDepartment " + departmentId + " Successfully Updated To " + newName + "!");
            DepartmentFunctions.setName(departmentId, newName);
        }
    }

    public static void updateCredits() {

        System.out.print("Course ID: ");
        Integer courseId = Input.inputInt();

        System.out.print("Set Credits: ");
        Double credits = Input.inputDouble();

        if (CourseFunctions.getCourse(courseId) == null) {
            System.out.println("\nCourse " + courseId + " Not Found!");
        } else {
            System.out.println("\nCredits in course " + courseId + " Successfully Updated To " + credits + "!");
            CourseFunctions.setCredits(courseId, credits);
        }
    }
}
