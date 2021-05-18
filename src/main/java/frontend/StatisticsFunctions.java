package frontend;

import backend.CourseFunctions;
import backend.DepartmentFunctions;
import backend.StudentFunctions;
import backend.TeacherFunctions;
import entity.*;
import main.Input;

import java.util.List;

public class StatisticsFunctions {

    public static void passRatioCourse() {

        System.out.print("Course ID: ");
        Integer courseId = Input.inputInt();
        Course course = CourseFunctions.getCourse(courseId);

        if (course != null) {
            List<Enrollment> enrollments = course.getEnrollments();

            int totalEnrollments = enrollments.size();
            int passes = 0;
            for (Enrollment e : enrollments) {
                if (e.getGrade() != null) {
                    if (e.getGrade() > 2) {
                        passes++;
                    }
                }
            }
            float percent = (passes * 100f) / totalEnrollments;
            System.out.println("\nPASSRATIO");
            System.out.println("COURSE " + courseId);
            System.out.println("------------");
            System.out.println(percent + "% passed");
        } else {
            System.out.println("\nCourse " + courseId + " Not Found!");
        }
    }

    public static void passRatioStudent() {

        System.out.print("Student SSN (YYYYMMDD-XXXX): ");
        String socialSecurity = Input.inputSSN();
        Student student = StudentFunctions.getStudent(socialSecurity);

        if (student != null) {
            List<Enrollment> enrollments = student.getEnrollments();

            if (enrollments != null) {

                int totalEnrollments = enrollments.size();
                int passes = 0;
                for (Enrollment e : enrollments) {
                    if (e.getGrade() != null) {
                        if (e.getGrade() > 2) {
                            passes++;
                        }
                    }
                }
                float percent = (passes * 100f) / totalEnrollments;
                System.out.println("\nPASS RATIO");
                System.out.println("STUDENT " + student.getName());
                System.out.println("------------");
                System.out.println("Courses passed " + percent + "%");

            } else {
                System.out.println("\nEnrollments Not Found!");
            }
        }
    }

    public static void genderRatioCourse() {

        System.out.print("Course ID: ");
        Integer courseId = Input.inputInt();

        Course courseGender = CourseFunctions.getCourse(courseId);

        if(courseGender !=null) {
            List<Enrollment> enrollments = courseGender.getEnrollments();

            if (enrollments != null) {
                int totalEnrollments = enrollments.size();
                int female = 0;
                for (Enrollment e : enrollments) {
                    if (e.getStudent().getGender().equals("Female")) {
                        female++;
                    }
                }
                float femalePercentage = (female * 100f) / totalEnrollments;
                System.out.println(femalePercentage + "% Women in course");
            }
            else {
                System.out.println("\nEnrollment Not Found!");
            }
        } else {
            System.out.println("\nCourse Not Found!");
        }
    }

    public static void genderRatioDepartment() {

        System.out.print("Department ID: ");
        Integer departmentId = Input.inputInt();

        Department department = DepartmentFunctions.getDepartment(departmentId);
        if(department != null) {
            List<Student> students = department.getStudents();

            if (students != null) {
                int totalStudents = students.size();
                int female = 0;
                for (Student s : students) {
                    if (s.getGender().equals("Female")) {
                        female++;
                    }
                }
                float femalePercentage = (female * 100f) / totalStudents;
                System.out.println(femalePercentage+ "% of students at department are women.");

            }else {
                System.out.println("\nNot Students Found!");
            }
        } else {
            System.out.println("\nDepartment Not Found!");
        }
    }

    public static void numberOfPerson() {

        List<Student> student = StudentFunctions.getAllStudents();
        List<Teacher> teacher = TeacherFunctions.getAllTeachers();

        int s = student.size();
        int t = teacher.size();
        int total = s + t;

        System.out.println("\nStudents  Teachers  Total");
        System.out.println("--------  --------  -------");
        System.out.printf("%-10d", s);
        System.out.printf("%-10d", t);
        System.out.printf("%-10d", total);
        System.out.println(" ");
    }


}
