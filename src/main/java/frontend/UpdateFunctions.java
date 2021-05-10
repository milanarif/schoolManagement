package frontend;

import backend.CourseFunctions;
import backend.DepartmentFunctions;
import backend.StudentFunctions;
import backend.TeacherFunctions;
import main.Input;

public class UpdateFunctions {

    public static void updateCourse(){

        System.out.print("Course id: ");
        Integer courseId = Input.inputInt();

        System.out.print("New course name: ");
        String newName = Input.inputString();

        CourseFunctions courseFunctions = new CourseFunctions();
        courseFunctions.setName(courseId, newName);
    }

    public static void updateStudent(){

        System.out.print("Social security: ");
        String socialSecurity = Input.inputString();

        System.out.print("New student name: ");
        String newName = Input.inputString();

        StudentFunctions studentFunctions = new StudentFunctions();
        studentFunctions.setName(socialSecurity, newName);
    }

    public static void updateTeacher(){

        System.out.print("Social security: ");
        String socialSecurity = Input.inputString();

        System.out.print("New teacher name: ");
        String newName = Input.inputString();

        TeacherFunctions teacherFunctions = new TeacherFunctions();
        teacherFunctions.setName(socialSecurity, newName);
    }

    public static void updateDepartment(){

        System.out.print("Department id: ");
        Integer departmentId = Input.inputInt();

        System.out.print("New department name: ");
        String newName = Input.inputString();

        DepartmentFunctions departmentFunctions = new DepartmentFunctions();
        departmentFunctions.setName(departmentId, newName);
    }
}
