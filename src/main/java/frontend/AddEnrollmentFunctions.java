package frontend;

import backend.*;
import main.Input;

public class AddEnrollmentFunctions {

    public static void setCourseStudent(){

        System.out.print("Student enrollment id: ");
        Integer enrollmentId = Input.inputInt();

        System.out.print("Course id: ");
        Integer courseId = Input.inputInt();

        EnrollmentFunctions.setCourse(enrollmentId, courseId);
    }

    public static void setCourseTeacher(){

        System.out.print("Teacher social security: ");
        String socialSecurity = Input.inputString();

        System.out.print("Enrollment id: ");
        Integer enrollmentId = Input.inputInt();

        TeacherFunctions.setCourse(socialSecurity, enrollmentId);
    }

    public static void setDepartmentStudent(){

        System.out.print("Social Security: ");
        String socialSecurity = Input.inputString();

        System.out.print("Department id: ");
        Integer departmentId = Input.inputInt();

        StudentFunctions.setDepartment(socialSecurity, departmentId);
    }

    public static void setDepartmentTeacher(){

        System.out.print("Social Security: ");
        String socialSecurity = Input.inputString();

        System.out.print("Department id: ");
        Integer departmentId = Input.inputInt();

        TeacherFunctions.setDepartment(socialSecurity, departmentId);
    }
}
