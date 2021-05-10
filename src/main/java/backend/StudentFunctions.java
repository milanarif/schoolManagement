package backend;

import dao.StudentDao;
import dao.StudentDaoImpl;
import entity.Enrollment;
import entity.Student;

import java.util.List;

public class StudentFunctions {
    static StudentDao studentDao = new StudentDaoImpl();

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
                if (e.getCourse() != null && e.getGrade() > 2) {
                    credits += e.getCourse().getCredits();
                }
            }
        }
        return credits;
    }

    //TODO: IMPLEMENTERA getAlls, method for calculating credits from enrollments?
    //TODO: MAYBE ADD NAME TO ENROLLMENT FROM COURSE NAME AND THEN KEEP ENROLLMENTS DESPITE COURSE BEING REMOVED. MAYBE CREDITS SHOULD ONLY
    //TODO: BE CALULATED USING ENROLLMENT LIST!? LESS RISK OF STALE DATA!!
}
