package frontend;

import backend.*;
import entity.*;
import main.Input;

import java.util.List;

public class AddEnrollmentFunctions {

    public static void setCourseStudent() {

        System.out.print("Student SSN (YYYYMMDD-XXXX): ");
        String socialSecurity = Input.inputSSN();

        System.out.print("Course ID: ");
        Integer courseId = Input.inputInt();

        Enrollment enrollment = new Enrollment();
        EnrollmentFunctions.addEnrollment(enrollment);

        Integer enrollmentId = enrollment.getId();
        Boolean findCourse = false;

        if (StudentFunctions.getStudent(socialSecurity) == null) {
            System.out.println("\nStudent Not Found!");
            EnrollmentFunctions.removeEnrollment(enrollmentId);
        } else if (StudentFunctions.getStudent(socialSecurity) != null) {
            List<Enrollment> enrollments = StudentFunctions.getStudent(socialSecurity).getEnrollments();
            for (Enrollment e : enrollments) {
                findCourse = e.getCourse().getCourseId().equals(courseId);
            }
            if (CourseFunctions.getCourse(courseId) == null) {
                System.out.println("\nCourse Not Found!");
                EnrollmentFunctions.removeEnrollment(enrollmentId);
            } else if (findCourse) {
                System.out.println("\nStudent already in this course");
                EnrollmentFunctions.removeEnrollment(enrollmentId);
            } else {
                System.out.println("\nCourse " + courseId + " Successfully Added To Student " + socialSecurity + "!");
                EnrollmentFunctions.setStudent(enrollmentId, socialSecurity);
                EnrollmentFunctions.setCourse(enrollmentId, courseId);
            }
        }
    }

    public static void setCourseTeacher() {

        System.out.print("Teacher SSN (YYYYMMDD-XXXX): ");
        String socialSecurity = Input.inputSSN();

        System.out.print("Course id: ");
        Integer courseId = Input.inputInt();

        if (TeacherFunctions.getTeacher(socialSecurity) == null) {
            System.out.println("\nTeacher Not Found!");
        } else if (CourseFunctions.getCourse(courseId) == null) {
            System.out.println("\nCourse Not Found!");
        } else if (TeacherFunctions.getTeacher(socialSecurity).getCourses().contains(CourseFunctions.getCourse(courseId))) {
            System.out.println("\nTeacher already in this Course!");
        } else {
            System.out.println("\nTeacher " + socialSecurity + " Successfully Added To Course " + courseId + "!");
            TeacherFunctions.setCourse(socialSecurity, courseId);
        }
    }

    public static void setDepartmentStudent() {

        System.out.print("Student SSN (YYYYMMDD-XXXX): ");
        String socialSecurity = Input.inputSSN();

        System.out.print("Department id: ");
        Integer departmentId = Input.inputInt();

        if (StudentFunctions.getStudent(socialSecurity) == null) {
            System.out.println("\nStudent Not Found!");
        } else if (DepartmentFunctions.getDepartment(departmentId) == null) {
            System.out.println("\nDepartment Not Found!");
        } else if (StudentFunctions.getStudent(socialSecurity).getDepartment() != null) {
            System.out.println("\nStudent already in a Department!");
        } else {
            System.out.println("\nStudent " + socialSecurity + " Successfully Added To Department " + departmentId + "!");
            StudentFunctions.setDepartment(socialSecurity, departmentId);
        }
    }

    public static void setDepartmentTeacher() {

        System.out.print("Teacher SSN (YYYYMMDD-XXXX): ");
        String socialSecurity = Input.inputSSN();

        System.out.print("Department id: ");
        Integer departmentId = Input.inputInt();

        if (TeacherFunctions.getTeacher(socialSecurity) == null) {
            System.out.println("\nTeacher Not Found!");
        } else if (DepartmentFunctions.getDepartment(departmentId) == null) {
            System.out.println("\nDepartment Not Found!");
        } else if (TeacherFunctions.getTeacher(socialSecurity).getDepartment() != null) {
            System.out.println("\nTeacher already in a Department!");
        } else {
            System.out.println("\nTeacher " + socialSecurity + " Successfully Added To Department " + departmentId + "!");
            TeacherFunctions.setDepartment(socialSecurity, departmentId);
        }
    }

    public static void setGrade() {

        System.out.print("Student SSN (YYYYMMDD-XXXX): ");
        String socialSecurity = Input.inputSSN();

        List<Enrollment> studentEnrollment = StudentFunctions.getStudent(socialSecurity).getEnrollments();
        String studentName = StudentFunctions.getStudent(socialSecurity).getName();

        System.out.println("\nCOURSE        ENROLLMENT IDs");
        System.out.println("Name          " + studentName);
        System.out.println("-----------   ------------------");

        for (Enrollment e : studentEnrollment) {
            System.out.printf("%-14s", e.getCourse().getName());
            System.out.printf("%-6s", e);
            System.out.println(" ");
        }
        System.out.println("\nInsert enrollment ID matching the course to set grade");
        System.out.print("Enrollment id: ");
        Integer enrollmentId = Input.inputInt();

        if (StudentFunctions.getStudent(socialSecurity).getEnrollments().contains(EnrollmentFunctions.getEnrollment(enrollmentId))) {

            System.out.println("Choose a grade between 1-5");
            System.out.print("Grade: ");
            Integer grade = Input.inputInt();

            if (0 <= grade && grade < 6) {
                if (EnrollmentFunctions.getEnrollment(enrollmentId) == null) {
                    System.out.println("\nEnrollment " + enrollmentId + " Not Found!");
                } else {
                    System.out.println("\nGrade " + grade + " Successfully Added To " + studentName + "!");
                    EnrollmentFunctions.setGrade(enrollmentId, grade);
                }
            } else {
                System.out.println("No such grade exist");
            }
        }
        else {
            System.out.println("Invalid enrollment ID");
        }
    }
}