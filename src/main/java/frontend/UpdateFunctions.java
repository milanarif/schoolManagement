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

public class UpdateFunctions {

    public static void updateCourse(){

        System.out.print("Course id: ");
        Integer courseId = Input.inputInt();

        System.out.print("New course name: ");
        String newName = Input.inputString();

        Course course = CourseFunctions.setName(courseId, newName);

        if (course != null) {
            System.out.println("\nCourse ("+ courseId + ") Successfully Updated To "+ newName + "!");
            CourseFunctions.setName(courseId, newName);
        } else {
            System.out.println("\nCourse (" + courseId + ") Not Found!");
        }
    }

    public static void updateStudent(){

        System.out.print("Social Security (YYYYMMDD-XXXX): ");
        String socialSecurity = Input.inputSSN();

        System.out.print("New Student Name: ");
        String newName = Input.inputString();

        Student student = StudentFunctions.setName(socialSecurity, newName);

        if (student != null) {
            System.out.println("\nStudent ("+ socialSecurity + ") Successfully Updated To "+ newName + "!");
            StudentFunctions.setName(socialSecurity, newName);
        } else {
            System.out.println("\nStudent (" + socialSecurity + ") Not Found!");
        }
    }

    public static void updateTeacher(){

        System.out.print("Social security (YYYYMMDD-XXXX): ");
        String socialSecurity = Input.inputSSN();

        System.out.print("New Teacher Name: ");
        String newName = Input.inputString();

        Teacher teacher = TeacherFunctions.setName(socialSecurity, newName);

        if (teacher != null) {
            System.out.println("\nTeacher ("+ socialSecurity + ") Successfully Updated To "+ newName + "!");
            TeacherFunctions.setName(socialSecurity, newName);
        } else {
            System.out.println("\nTeacher (" + socialSecurity + ") Not Found!");
        }
    }

    public static void updateDepartment(){

        System.out.print("Department ID: ");
        Integer departmentId = Input.inputInt();

        System.out.print("New Department Name: ");
        String newName = Input.inputString();

        Department department = DepartmentFunctions.setName(departmentId, newName);

        if (department != null) {
            System.out.println("\nDepartment ("+ departmentId + ") Successfully Updated To "+ newName + "!");
            DepartmentFunctions.setName(departmentId, newName);
        } else {
            System.out.println("\nDepartment (" + departmentId + ") Not Found!");
        }
    }

    public static void updateCredits(){

        System.out.print("Course ID: ");
        Integer courseId = Input.inputInt();

        System.out.print("Set Credits: ");
        Double credits = Input.inputDouble();

        Course course = CourseFunctions.setCredits(courseId, credits);

        if (course != null) {
            System.out.println("\nCredits in course ("+ courseId + ") Successfully Updated To "+ credits + "!");
            CourseFunctions.setCredits(courseId, credits);
        } else {
            System.out.println("\nCourse (" + courseId + ") Not Found!");
        }
    }
}
