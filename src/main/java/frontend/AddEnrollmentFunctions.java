package frontend;

import backend.*;
import entity.Course;
import entity.Enrollment;
import entity.Teacher;
import main.Input;

public class AddEnrollmentFunctions {


    public static void setCourseStudent(){

        System.out.print("Student Social Security: ");
        String socialSecurity = Input.inputString();

        System.out.print("Course id: ");
        Integer courseId = Input.inputInt();

        Enrollment enrollment = new Enrollment();
        EnrollmentFunctions.addEnrollment(enrollment);

        Integer enrollmentId = enrollment.getId();
        EnrollmentFunctions.setStudent(enrollmentId, socialSecurity);

        EnrollmentFunctions.setCourse(enrollmentId, courseId);
    }

    public static void setCourseTeacher(){

        System.out.print("Teacher social security: ");
        String socialSecurity = Input.inputString();

        System.out.print("Course id: ");
        Integer courseId = Input.inputInt();

        Teacher teacher = TeacherFunctions.setCourse(socialSecurity, courseId);
        if (teacher == null) {
            System.out.println("\nTeacher Not Found!");
        }
        else if (teacher.getCourses().contains(CourseFunctions.getCourse(courseId))) {
            System.out.println("\nCourse Successfully Added!");
        } else  {
            System.out.println("\nCourse Not Found!");
        }
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
