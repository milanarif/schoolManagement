package frontend;

import entity.*;
import main.Input;
import backend.*;
import main.SocialSecurityChecker;

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
        boolean valid;
        String socialSecurity;
        do {
            System.out.print("Social security (YYYY-MM-DD-XXXX): ");
            socialSecurity = Input.inputString();
            valid = SocialSecurityChecker.socialSecurityValidator(socialSecurity);
            if (!valid){
                System.out.println("Invalid Swedish Social Security, try again!");
            }
        } while (!valid);


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
        boolean valid;
        String socialSecurity;
        do {
            System.out.print("Social security (YYYY-MM-DD-XXXX): ");
            socialSecurity = Input.inputString();
            valid = SocialSecurityChecker.socialSecurityValidator(socialSecurity);
            if (!valid){
                System.out.println("Invalid Swedish Social Security, try again!");
            }
        } while (!valid);

        System.out.print("Name: ");
        String name = Input.inputString();

        System.out.print("Gender: ");
        String gender = SocialSecurityChecker.getGender(socialSecurity);


        if (TeacherFunctions.getAllTeachers().contains(teacher)) {
            System.out.println("Teacher with that social security already exists. (" + socialSecurity + ").");
        } else {
            TeacherFunctions.addTeacher(teacher);
        }
    }

    public static void addDepartment(){

        System.out.print("Department name: ");
        String name = Input.inputString();

        Department department = new Department(name);

        DepartmentFunctions.addDepartment(department);
    }
}
