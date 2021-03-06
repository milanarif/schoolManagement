package backend;

import dao.EnrollmentDao;
import dao.EnrollmentDaoImpl;
import entity.Enrollment;
import entity.Student;

import java.util.List;

public class EnrollmentFunctions {

    static EnrollmentDao enrollmentDao = new EnrollmentDaoImpl();

    public static Enrollment getEnrollment(Integer enrollmentId) {
        return enrollmentDao.getEnrollment(enrollmentId);
    }

    public static void addEnrollment(Enrollment enrollment){
        enrollmentDao.addEnrollment(enrollment);
    }

    public static Enrollment removeEnrollment(Integer enrollmentId) {
        return enrollmentDao.removeEnrollment(enrollmentId);
    }

    public static Enrollment setCourse(Integer enrollmentId, Integer courseId) {
        return enrollmentDao.setCourse(enrollmentId, courseId);
    }

    public static Enrollment setStudent(Integer enrollmentId, String socialSecurity) {
        return enrollmentDao.setStudent(enrollmentId, socialSecurity);
    }

    public static Enrollment setGrade(Integer enrollmentId, Integer grade) {
        return enrollmentDao.gradeEnrollment(enrollmentId, grade);
    }

    public static Enrollment removeCourse(String socialSecurity, Integer courseId) {

        Student student = StudentFunctions.studentDao.getStudent(socialSecurity);

        List<Enrollment> enrollments = student.getEnrollments();
        Integer enrollmentId = null;
        if (enrollments != null) {
            for (Enrollment e : enrollments) {

                enrollmentId = e.getId();
                }
            }

        return enrollmentDao.removeCourse(enrollmentId, courseId);
    }

    public static void removeCourse(Integer enrollmentId) {
        enrollmentDao.removeCourse(enrollmentId);
    }
}
