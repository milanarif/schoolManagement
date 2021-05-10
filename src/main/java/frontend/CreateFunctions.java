package frontend;

import entity.Course;
import entity.Department;
import entity.Student;
import entity.Teacher;
import main.Input;
import backend.*;
public class CreateFunctions {

    public static void addCourse(Course course){


    }

    public static void addStudent(){

        System.out.print("Social security: ");
        String socialSecurity = Input.inputString();

        System.out.print("Name: ");
        String name = Input.inputString();

        System.out.print("Gender: ");
        String gender = Input.inputString();

        Student s = new Student(socialSecurity, name, gender);
        StudentFunctions.addStudent(s);
    }

    public static void addTeacher(Teacher teacher){

    }

    public static void addDepartment(Department department){

    }


}
