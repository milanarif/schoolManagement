package frontend;

import backend.CourseFunctions;
import backend.DepartmentFunctions;
import backend.StudentFunctions;
import backend.TeacherFunctions;
import main.Input;

public class DeleteFunctions {

    public static void deleteCourse(){

        System.out.print("Course id: ");
        Integer courseId = Input.inputInt();

        CourseFunctions.removeCourse(courseId);
    }

    public static void deleteStudent(){

        System.out.print("Social security: ");
        String socialSecurity = Input.inputSSN();

        StudentFunctions.removeStudent(socialSecurity);
    }

    public static void deleteTeacher(){

        System.out.print("Social security: ");
        String socialSecurity = Input.inputSSN();

        TeacherFunctions.removeTeacher(socialSecurity);
    }

    public static void deleteDepartment(){

        System.out.print("Department id: ");
        Integer departmentId = Input.inputInt();

        DepartmentFunctions.removeDepartment(departmentId);
    }
}