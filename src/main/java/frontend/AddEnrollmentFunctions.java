package frontend;

import backend.*;
import entity.Enrollment;
import entity.Student;
import entity.Teacher;
import main.Input;

public class AddEnrollmentFunctions {

    public static void setGrade(){

        System.out.print("Enrollment id: ");
        Integer enrollmentId = Input.inputInt();

    System.out.println("Choose a grade between 1-5.");
    System.out.print("Grade: ");
    Integer grade = Input.inputInt();

    if (grade <= 5 || grade == 0)
        System.out.println("No such grade exist");


        Enrollment enrollment = EnrollmentFunctions.setGrade(enrollmentId, grade);
        if (enrollment == null)
            System.out.println("\nEnrollment Not Found!");
         else if(enrollment.getGrade() == grade)
            System.out.println("\nGrade "+grade+" Successfully Added To Enrollment");


    }


    public static void setCourseStudent(){

        System.out.print("Student SSN (YYYYMMDD-XXXX): ");
        String socialSecurity = Input.inputString();

        System.out.print("Course id: ");
        Integer courseId = Input.inputInt();

        Enrollment enrollment = new Enrollment();
        EnrollmentFunctions.addEnrollment(enrollment);

        Integer enrollmentId = enrollment.getId();

        if (StudentFunctions.getStudent(socialSecurity) == null) {
            System.out.println("\nStudent Not Found!");
            EnrollmentFunctions.removeEnrollment(enrollmentId);
        }
        EnrollmentFunctions.setStudent(enrollmentId, socialSecurity);

        EnrollmentFunctions.setCourse(enrollmentId, courseId);


        if (CourseFunctions.getCourse(courseId) == null){
            System.out.println("\nCourse Not Found!");
            EnrollmentFunctions.removeEnrollment(enrollmentId);
        } else {
            System.out.println("\nCourse (" + courseId + ") Successfully Added To Student!");
        }
    }

    public static void setCourseTeacher(){

        System.out.print("Teacher SSN (YYYYMMDD-XXXX): ");
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

        System.out.print("Student SSN (YYYYMMDD-XXXX): ");
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
    }

    public static void setDepartmentTeacher(){

        System.out.print("Teacher SSN (YYYYMMDD-XXXX): ");
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
    }
}
