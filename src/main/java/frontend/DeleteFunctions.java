package frontend;

import backend.CourseFunctions;
import backend.DepartmentFunctions;
import backend.StudentFunctions;
import backend.TeacherFunctions;
import entity.Course;
import entity.Department;
import entity.Student;
import entity.Teacher;
import main.Input;

public class DeleteFunctions {

    public static void deleteCourse(){

        System.out.print("Course ID: ");
        Integer courseId = Input.inputInt();

        Course course = CourseFunctions.getCourse(courseId);

        if (course != null) {
            System.out.println("\nCourse (" + courseId + ") Successfully Deleted!");
            CourseFunctions.removeCourse(courseId);
        } else {
            System.out.println("\nCourse (" + courseId + ") Not Found!");
        }
    }

    public static void deleteStudent(){

        System.out.print("Social security (YYYYMMDD-XXXX): ");
        String socialSecurity = Input.inputSSN();

        Student student = StudentFunctions.removeStudent(socialSecurity);

        if (student != null) {
            System.out.println("\nStudent (" + socialSecurity + ") Successfully Deleted!");
            StudentFunctions.removeStudent(socialSecurity);
        } else {
            System.out.println("\nStudent (" + socialSecurity + ") Not Found!");
        }

    }

    public static void deleteTeacher(){

        System.out.print("Teacher Social Security: (YYYYMMDD-XXXX):  ");
        String socialSecurity = Input.inputSSN();

        Teacher teacher = TeacherFunctions.removeTeacher(socialSecurity);

        if (teacher != null) {
            System.out.println("\nTeacher (" + socialSecurity + ") Successfully Deleted!");
            TeacherFunctions.removeTeacher(socialSecurity);
        } else {
            System.out.println("\nTeacher (" + socialSecurity + ") Not Found!");
        }

    }

    public static void deleteDepartment(){

        System.out.print("Department ID: ");
        Integer departmentId = Input.inputInt();

        Department department = DepartmentFunctions.removeDepartment(departmentId);

        if (department != null) {
            System.out.println("\nDepartment (" + departmentId + ") Successfully Deleted!");
            DepartmentFunctions.removeDepartment(departmentId);
        } else {
            System.out.println("\nDepartment (" + departmentId + ") Not Found!");
        }
    }
}