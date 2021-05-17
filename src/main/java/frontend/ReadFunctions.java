package frontend;

import backend.*;

public class ReadFunctions {

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
