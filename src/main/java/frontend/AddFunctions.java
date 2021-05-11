package frontend;

import entity.*;
import main.Input;
import backend.*;
public class AddFunctions {

    public static void addCourse(){

        System.out.print("Course name: ");
        String name = Input.inputString();

        System.out.print("Credits: ");
        Double credits = Input.inputDouble();

        Course course = new Course(name, credits);
        CourseFunctions.addCourse(course);
    }

    public static void addStudent(){

        System.out.print("Social security: ");
        String socialSecurity = Input.inputString();

        System.out.print("Name: ");
        String name = Input.inputString();

        System.out.print("Gender: ");
        String gender = Input.inputString();

        StudentFunctions.addStudent(new Student(socialSecurity, name, gender));
    }

    public static void addTeacher(){

        System.out.print("Social security: ");
        String socialSecurity = Input.inputString();

        System.out.print("Name: ");
        String name = Input.inputString();

        System.out.print("Gender: ");
        String gender = Input.inputString();

        Teacher teacher = new Teacher(socialSecurity, name, gender);
        TeacherFunctions.addTeacher(teacher);
    }

    public static void addDepartment(){

        System.out.print("Department name: ");
        String name = Input.inputString();

        Department department = new Department(name);
        DepartmentFunctions.addDepartment(department);
    }
}
