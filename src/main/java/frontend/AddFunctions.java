package frontend;

import entity.*;
import main.Input;
import backend.*;
import main.SocialSecurityChecker;

import java.util.List;

public class AddFunctions {

    public static void addCourse() {

        System.out.print("Course name: ");
        String name = Input.inputString();

        System.out.print("Credits: ");
        Double credits = Input.inputDouble();

        boolean uniqueCourse = false;
        List<Course> courses = CourseFunctions.getAllCourses();
        for (Course c : courses) {
            uniqueCourse = c.getName().equals(name);
        }
        if (uniqueCourse) {
            System.out.println("\nCourse by that name already exists!");
        } else {
            System.out.println("\nCourse " + name + " Successfully Added!");
            Course course = new Course(name, credits);
            CourseFunctions.addCourse(course);
        }
    }

    public static void addStudent() {
        System.out.print("Student SSN (YYYYMMDD-XXXX): ");
        String socialSecurity = Input.inputSSN();

        System.out.print("Name: ");
        String name = Input.inputString();

        String gender = SocialSecurityChecker.getGender(socialSecurity);

        Student student = new Student(socialSecurity, name, gender);

        if (StudentFunctions.getAllStudents().contains(student)) {
            System.out.println("\nStudent with that social security already exists " + socialSecurity + "!");
        } else {
            System.out.println("\nStudent " + socialSecurity + ", " + name + " Successfully Added");
            StudentFunctions.addStudent(student);
        }
    }

    public static void addTeacher() {
        System.out.print("Teacher SSN (YYYYMMDD-XXXX): ");
        String socialSecurity = Input.inputSSN();

        System.out.print("Name: ");
        String name = Input.inputString();

        String gender = SocialSecurityChecker.getGender(socialSecurity);

        Teacher teacher = new Teacher(socialSecurity, name, gender);

        if (TeacherFunctions.getAllTeachers().contains(teacher)) {
            System.out.println("Teacher with that social security already exists " + socialSecurity + "!");
        } else {
            System.out.println("\nTeacher " + socialSecurity + ", " + name + " Successfully Added");
            TeacherFunctions.addTeacher(teacher);
        }
    }

    public static void addDepartment() {

        System.out.print("Department name: ");
        String name = Input.inputString();

        boolean uniqueDepartment = false;
        List<Department> departments = DepartmentFunctions.getAllDepartments();
        for (Department d : departments) {
            uniqueDepartment = d.getName().equals(name);
        }
        if (uniqueDepartment) {
            System.out.println("\nDepartment by that name already exists!");
        } else {
            System.out.println("\nDepartment " + name + " Successfully Added!");
            Department department = new Department(name);
            DepartmentFunctions.addDepartment(department);
        }
    }

}
