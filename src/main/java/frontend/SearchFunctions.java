package frontend;

import backend.CourseFunctions;
import backend.DepartmentFunctions;
import backend.StudentFunctions;
import backend.TeacherFunctions;
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
            System.out.println("\nCourse: " + courseName.toUpperCase());
            System.out.println("Teacher: " + teacherName);
            System.out.println("\nStudents in course ");
            System.out.println("-------------------");

            for (Enrollment e:enrollment) {
                System.out.printf("%-16s", e.getStudent().getName());
                System.out.println(" ");
            }
        } else {
            System.out.println("No such course ID " + courseId+"");
        }
    }

    public static void searchStudent() {

        System.out.print("Student SSN (YYYYMMDD-XXXX): ");
        String socialSecurity = Input.inputSSN();

        Student student = StudentFunctions.getStudent(socialSecurity);

        if(student != null){
            PrintFunctions.printStudentHeadSearch(student);
        } else {
            System.out.println("No such student (" + socialSecurity+")");
        }
    }

    public static void searchTeacher() {


        System.out.print("Teacher SSN (YYYYMMDD-XXXX): ");
        String socialSecurity = Input.inputSSN();

        Teacher teacher = TeacherFunctions.getTeacher(socialSecurity);

        if(teacher != null){
            PrintFunctions.printTeacherHeadSearch(teacher);
        } else {
            System.out.println("No such teacher (" + socialSecurity+")");
        }
    }

    public static void searchDepartment() {

        System.out.print("Department ID: ");
        Integer departmentId = Input.inputInt();

        Department department = DepartmentFunctions.getDepartment(departmentId);

        if(department != null) {
            PrintFunctions.printDepartmentHeadSearch(department);
        } else {
            System.out.println("No such department ID (" + departmentId+")");
        }
    }
}
