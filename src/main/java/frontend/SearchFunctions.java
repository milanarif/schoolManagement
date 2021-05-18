package frontend;

import backend.*;
import entity.*;
import main.Input;

import java.util.List;

public class SearchFunctions {

    public static void searchCourse() {

        System.out.print("Course id: ");
        Integer courseId = Input.inputInt();

        Course course = CourseFunctions.getCourse(courseId);

        if(course != null) {
            List<Enrollment> enrollment = CourseFunctions.getCourse(courseId).getEnrollments();
            String courseName = null;
            List<Teacher> teacherName1;
            String teacherName = null;
            for (Enrollment e:enrollment) {
                courseName = e.getCourse().getName();
                teacherName1 = e.getCourse().getTeachers();
                for (Teacher t:teacherName1) {
                    teacherName = t.getName();
                }
            }
            System.out.println("\nCourse: " + courseName);
            System.out.println("Teacher: " + teacherName);
            System.out.println("\n" + enrollment.size() + " Students in course ");
            System.out.println("-------------------");

            for (Enrollment e:enrollment) {
                System.out.println(e.getStudent().getName());
            }
        } else {
            System.out.println("\nNo such course ID " + courseId+"");
        }
    }

    public static void searchStudent() {

        System.out.print("Student SSN (YYYYMMDD-XXXX): ");
        String socialSecurity = Input.inputSSN();

        Student student = StudentFunctions.getStudent(socialSecurity);

        if(student != null){
            List<Enrollment> enrollments = StudentFunctions.getStudent(socialSecurity).getEnrollments();

            System.out.println("\n" + student.getName());
            System.out.println(socialSecurity);
            System.out.println("\nIn " + enrollments.size() + " courses");
            System.out.println("--------------");

            for (Enrollment e:enrollments) {
                System.out.println(e.getCourse().getName());
            }
        } else {
            System.out.println("\nNo such student " + socialSecurity + "!");
        }
    }

    public static void searchTeacher() {

        System.out.print("Teacher SSN (YYYYMMDD-XXXX): ");
        String socialSecurity = Input.inputSSN();

        Teacher teacher = TeacherFunctions.getTeacher(socialSecurity);

        if(teacher != null){
            List<Course> courses = TeacherFunctions.getTeacher(socialSecurity).getCourses();

            System.out.println("\n" + teacher.getName());
            System.out.println(socialSecurity);
            System.out.println("\nIn " + courses.size() + " courses");
            System.out.println("--------------");

            for (Course c:courses) {
                System.out.println(c.getName());
            }
        } else {
            System.out.println("\nNo such teacher " + socialSecurity + "!");
        }
    }

    public static void searchDepartment() {

        System.out.print("Department ID: ");
        Integer departmentId = Input.inputInt();

        Department department = DepartmentFunctions.getDepartment(departmentId);

        if(department != null) {
            List<Student> students = DepartmentFunctions.getDepartment(departmentId).getStudents();
            List<Teacher> teachers = DepartmentFunctions.getDepartment(departmentId).getTeachers();

            Integer totalSize = students.size() + teachers.size();
            System.out.println("\nDepartment " + department.getName());
            System.out.println("Total " + totalSize + " Persons");
            System.out.println("-------------------");

            for (Student s: students){
                System.out.println(s.getName());
            }
            for (Teacher t : teachers){
                System.out.println(t.getName());
            }
        } else {
            System.out.println("No such department ID " + departmentId+"!");
        }
    }
}
