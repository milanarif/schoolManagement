package backend;

import dao.StudentDao;
import dao.StudentDaoImpl;
import entity.Enrollment;
import entity.Student;
import frontend.PrintFunctions;

import java.util.List;

public class StudentFunctions {
    static StudentDao studentDao = new StudentDaoImpl();

    public static void readAllStudentsCourse(List<Enrollment>enrollments){
PrintFunctions.printOnlyStudentHead();
       if(enrollments != null) {
            for (Enrollment e : enrollments) {
           PrintFunctions.printStudent(e.getStudent());
            }
        }else{
            System.out.println("No Students in this course!");
        }

    }

    public static List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    public static Student getStudent(String socialSecurity) {
        return studentDao.getStudent(socialSecurity);
    }

    public static void addStudent(Student student) {
        studentDao.addStudent(student);
    }

    public static Student removeStudent(String socialSecurity) {
        List<Enrollment> enrollments = studentDao.getStudent(socialSecurity).getEnrollments();
        for (Enrollment e : enrollments) {
            EnrollmentFunctions.removeEnrollment(e.getId());
        }
        return studentDao.removeStudent(socialSecurity);
    }

    public static Student setName(String socialSecurity, String newName) {
        return studentDao.setName(socialSecurity, newName);
    }

    public static Student setDepartment(String socialSecurity, Integer departmentId) {
        return studentDao.setDepartment(socialSecurity, departmentId);
    }

    public static double getCredits(String socialSecurity) {
        Student student = studentDao.getStudent(socialSecurity);
        List<Enrollment> enrollments = student.getEnrollments();
        double credits = 0;
        if (enrollments != null) {
            for (Enrollment e : enrollments) {
                if (e.getCourse() != null && e.getGrade() != null &&e.getGrade() > 2) {
                    credits += e.getCourse().getCredits();
                }
            }
        }
        return credits;
    }

    public static Student removeDepartment(String socialSecurity) {
        return studentDao.removeDepartment(socialSecurity);
    }
}
