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

        CourseFunctions courseFunctions = new CourseFunctions();
        courseFunctions.removeCourse(courseId);
    }

    public static void deleteStudent(){

        System.out.print("Social security: ");
        String socialSecurity = Input.inputString();

        StudentFunctions studentFunctions = new StudentFunctions();
        studentFunctions.removeStudent(socialSecurity);
    }

    public static void deleteTeacher(){

        System.out.print("Social security: ");
        String socialSecurity = Input.inputString();

        TeacherFunctions teacherFunctions = new TeacherFunctions();
        teacherFunctions.removeTeacher(socialSecurity);
    }

    public static void deleteDepartment(){

        System.out.print("Department id: ");
        Integer departmentId = Input.inputInt();

        DepartmentFunctions departmentFunctions = new DepartmentFunctions();
        departmentFunctions.removeDepartment(departmentId);
    }
}
