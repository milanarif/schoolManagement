package frontend;

import backend.*;
import main.Input;

public class AddEnrollmentFunctions {

    public static void setCourseStudent(){

        System.out.print("Enrollment id: ");
        Integer enrollmentId = Input.inputInt();

        System.out.print("Student social security: ");
        String socialSecurity = Input.inputString();


        EnrollmentFunctions.setStudent(enrollmentId, socialSecurity);
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
