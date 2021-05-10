package backend;

import dao.EnrollmentDao;
import dao.EnrollmentDaoImpl;
import entity.Enrollment;
import entity.Student;

import java.util.List;

public class EnrollmentFunctions {

    public static Integer enrollmentIdForNewStudent;

    static EnrollmentDao enrollmentDao = new EnrollmentDaoImpl();

    //public static List<Enrollment> getAllEnrollments() { return enrollmentDao.getAllEnrollments(); }

    public static Enrollment getEnrollment(Integer enrollmentId) {
        return enrollmentDao.getEnrollment(enrollmentId);
    }

    public static void addEnrollment(Enrollment enrollment){
        enrollmentDao.addEnrollment(enrollment);

        enrollmentIdForNewStudent = enrollment.getId();
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
}
