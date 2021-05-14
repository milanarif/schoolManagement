
package frontend;

import backend.StudentFunctions;
import backend.TeacherFunctions;
import entity.Enrollment;
import entity.Student;
import entity.Teacher;

import java.util.List;

public class StatisticsFunctions {

    public static Integer passRatio(List<Enrollment> enrollments) {
        if (enrollments == null) {
            return null;
        }
        int totalEnrollments = enrollments.size();
        int passes = 0;
        for (Enrollment e : enrollments) {
            if (e.getGrade() > 2) {
                passes++;
            }
        }
        return ((passes/totalEnrollments)*100);
    }

    public static Integer genderRatioCourse(List<Enrollment> enrollments) {
        if (enrollments == null) {
            return null;
        }
        int totalEnrollments = enrollments.size();
        int female = 0;
        for (Enrollment e : enrollments) {
            if (e.getStudent().getGender() == "Female") {
                female++;
            }
        }
        return ((female/totalEnrollments)*100);
    }

    public static Integer genderRatioDepartment(List<Student> students) {
        if (students == null) {
            return null;
        }
        int totalStudents = students.size();
        int female = 0;
        for (Student s : students) {
            if (s.getGender() == "Female") {
                female++;
            }
        }
        return ((female/totalStudents)*100);
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
