package frontend;

import entity.*;
import main.Input;
import backend.*;
import main.SocialSecurityChecker;

import java.util.List;

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
        System.out.print("Student SSN (YYYYMMDD-XXXX): ");
        String socialSecurity = Input.inputSSN();

        System.out.print("Name: ");
        String name = Input.inputString();

        String gender = SocialSecurityChecker.getGender(socialSecurity);

        Student student = new Student(socialSecurity, name, gender);

        if (StudentFunctions.getAllStudents().contains(student)) {
            System.out.println("Student with that social security already exists. (" + socialSecurity + ").");
        } else {
            StudentFunctions.addStudent(student);
        }
    }

    public static void addTeacher(){
        System.out.print("Teacher SSN (YYYYMMDD-XXXX): ");
        String socialSecurity = Input.inputSSN();

        System.out.print("Name: ");
        String name = Input.inputString();

        String gender = SocialSecurityChecker.getGender(socialSecurity);

        Teacher teacher = new Teacher(socialSecurity, name, gender);

        if (TeacherFunctions.getAllTeachers().contains(teacher)) {
            System.out.println("Teacher with that social security already exists. (" + socialSecurity + ").");
        } else {
            TeacherFunctions.addTeacher(teacher);
        }
    }

    public static void addDepartment(){

        System.out.print("Department name: ");
        String name = Input.inputString();
        boolean unique = true;
        Department department = new Department(name);
        List<Department> departments = DepartmentFunctions.getAllDepartments();
        for (Department d : departments) {
            if (d.getName() == name) {
                System.out.println("Department with this name already exists");
                unique = false;
            }
        }
        if (unique) {
            DepartmentFunctions.addDepartment(department);
        }
    }

}
