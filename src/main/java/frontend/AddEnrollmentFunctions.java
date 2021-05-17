package frontend;

import backend.*;
import entity.*;
import main.Input;

import java.util.ArrayList;
import java.util.List;

public class AddEnrollmentFunctions {

    public static void setCourseStudent() {

        System.out.print("Student SSN (YYYYMMDD-XXXX): ");
        String socialSecurity = Input.inputSSN();

        System.out.print("Course ID: ");
        Integer courseId = Input.inputInt();

        Student student = StudentFunctions.getStudent(socialSecurity);
        Course course = CourseFunctions.getCourse(courseId);
        List<Course> courses = new ArrayList<>();
        boolean existing = false;

        if (student != null && course != null) {
            List<Enrollment> enrollments = student.getEnrollments();
            if (!enrollments.isEmpty()) {
                for (Enrollment e : enrollments) {
                    if (e.getCourse() != null) {
                        courses.add(e.getCourse());
                    }
                }
                if (courses.contains(course)) {
                    existing = true;
                    System.out.println("Student already enrolled in course.");
                }
            }
            if (!existing){
                Enrollment enrollment = new Enrollment();
                EnrollmentFunctions.addEnrollment(enrollment);
                EnrollmentFunctions.setStudent(enrollment.getId(), student.getSocialSecurity());
                EnrollmentFunctions.setCourse(enrollment.getId(), course.getCourseId());
                System.out.println("\nStudent " + StudentFunctions.getStudent(socialSecurity).getName() + " Successfully Added To Course " + CourseFunctions.getCourse(courseId).getName() + "!");
            }

        } else if (student == null && course != null) {
            System.out.println("Student not found.");
        }
        else if (student != null){
            System.out.println("Course not found.");
        }
        else {
            System.out.println("Student and course not found.");
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