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

import java.util.ArrayList;
import java.util.List;

public class SearchFunctions {

    public static void searchCourse() {

        System.out.print("Course id: ");
        Integer courseId = Input.inputInt();

        Course course = CourseFunctions.getCourse(courseId);
        PrintFunctions.printCourseHeadSearch(course);
    }

    public static void searchStudent() {

        System.out.print("Student social security: ");
        String socialSecurity = Input.inputString();

        Student student = StudentFunctions.getStudent(socialSecurity);
        PrintFunctions.printStudentHeadSearch(student);
    }

    public static void searchTeacher() {

        System.out.print("Student social security: ");
        String socialSecurity = Input.inputString();

        Teacher teacher = TeacherFunctions.getTeacher(socialSecurity);
        PrintFunctions.printTeacherHeadSearch(teacher);
    }

    public static void searchDepartment() {

        System.out.print("Department id: ");
        Integer departmentId = Input.inputInt();

        Department department = DepartmentFunctions.getDepartment(departmentId);
        PrintFunctions.printDepartmentHeadSearch(department);
    }
}
