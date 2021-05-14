package frontend;

import backend.*;
import entity.Enrollment;
import entity.Student;
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

        if (StudentFunctions.getStudent(socialSecurity) == null) {
            System.out.println("\nStudent Not Found!");
            EnrollmentFunctions.removeEnrollment(enrollmentId);
        } else if (CourseFunctions.getCourse(courseId) == null){
            System.out.println("\nCourse Not Found!");
            EnrollmentFunctions.removeEnrollment(enrollmentId);
        } else {
            System.out.println("\nCourse (" + courseId + ") Successfully Added To Student!");
        }
    }

    public static void setCourseTeacher(){

        System.out.print("Teacher social security: ");
        String socialSecurity = Input.inputString();

        System.out.print("Course id: ");
        Integer courseId = Input.inputInt();

        Teacher teacher = TeacherFunctions.setCourse(socialSecurity, courseId);
        if (teacher == null) {
            System.out.println("\nTeacher Not Found!");
        } else if (teacher.getCourses().contains(CourseFunctions.getCourse(courseId))) {
            System.out.println("\nCourse ("+ courseId +") Successfully Added To Teacher!");
        } else  {
            System.out.println("\nCourse Not Found!");
        }
    }

    public static void setDepartmentStudent(){

        System.out.print("Student Social Security: ");
        String socialSecurity = Input.inputString();

        System.out.print("Department id: ");
        Integer departmentId = Input.inputInt();
      Student student = StudentFunctions.setDepartment(socialSecurity, departmentId);
        if(student == null)
            System.out.println("\nStudent Not Found!");
        else if (student.getDepartment().getDepartmentId() == departmentId)
            System.out.println("\nDepartment ("+ departmentId +") Successfully Added To Student!");
        else
            System.out.println("\nDepartment Not Found!");

        //TODO add if statements?
    }

    public static void setDepartmentTeacher(){

        System.out.print("Teacher Social Security: ");
        String socialSecurity = Input.inputString();

        System.out.print("Department id: ");
        Integer departmentId = Input.inputInt();

       Teacher teacher = TeacherFunctions.setDepartment(socialSecurity, departmentId);
        if(teacher == null)
            System.out.println("\nTeacher Not Found!");
        else if (teacher.getDepartment().getDepartmentId() == departmentId)
            System.out.println("\nDepartment ("+ departmentId +") Successfully Added To Teacher!");
        else
            System.out.println("\nDepartment Not Found!");

        //TODO add if statements?
    }
}
