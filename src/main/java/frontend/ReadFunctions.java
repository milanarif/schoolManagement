package frontend;

import backend.*;
import entity.*;

import java.util.List;

public class ReadFunctions {

    static List<Student> student = StudentFunctions.getAllStudents();
    static List<Teacher> teacher = TeacherFunctions.getAllTeachers();
    static List<Course> course = CourseFunctions.getAllCourses();
    static List<Department> department = DepartmentFunctions.getAllDepartments();

    public static void readAll(){

        PrintFunctions.printStudentHead(student);
        PrintFunctions.printTeacherHead(teacher);
        PrintFunctions.printCourseHead(course);
        PrintFunctions.printDepartmentHead(department);
    }

    public static void readCourse(){

        PrintFunctions.printCourseHead(course);
    }

    public static void readStudent(){

        PrintFunctions.printStudentHead(student);
    }

    public static void readTeacher(){

        PrintFunctions.printTeacherHead(teacher);
    }

    public static void readDepartment(){

        PrintFunctions.printDepartmentHead(department);
    }
}
