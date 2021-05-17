package frontend;

import backend.*;
import entity.Course;
import main.Input;

public class ReadFunctions {

    public static void readAllStudentsCourse(){
        System.out.print("Course ID: ");
        Integer courseId = Input.inputInt();
        Course course = CourseFunctions.getCourse(courseId);
        if(course != null) {
            PrintFunctions.printCourseWithHead(course);
            StudentFunctions.readAllStudentsCourse(course.getEnrollments());
        } else {
            System.out.println("\nCourse (" + courseId + ") Not Found!");
        }
    }

    public static void readAll(){

        PrintFunctions.printStudentHead(StudentFunctions.getAllStudents());
        PrintFunctions.printTeacherHead(TeacherFunctions.getAllTeachers());
        PrintFunctions.printCourseHead(CourseFunctions.getAllCourses());
        PrintFunctions.printDepartmentHead(DepartmentFunctions.getAllDepartments());
    }

    public static void readCourse(){

        PrintFunctions.printCourseHead(CourseFunctions.getAllCourses());
    }

    public static void readStudent(){

        PrintFunctions.printStudentHead(StudentFunctions.getAllStudents());
    }

    public static void readTeacher(){

        PrintFunctions.printTeacherHead(TeacherFunctions.getAllTeachers());
    }

    public static void readDepartment(){

        PrintFunctions.printDepartmentHead(DepartmentFunctions.getAllDepartments());
    }
}
