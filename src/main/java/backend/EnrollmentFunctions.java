package backend;

import dao.EnrollmentDao;
import dao.EnrollmentDaoImpl;
import entity.Course;
import entity.Enrollment;
import entity.Student;

public class EnrollmentFunctions {

    static EnrollmentDao enrollmentDao = new EnrollmentDaoImpl();
    //public static Integer enrollmentIdSetCourse;

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
/*
    public static Enrollment setCourse(String socialSecurity, Integer courseId) {
        Enrollment enrollment = new Enrollment();
        Student student = StudentFunctions.getStudent(socialSecurity);
        Course course = CourseFunctions.getCourse(courseId);

        if (student != null && course != null) {
            enrollment.setStudent(student);
            enrollment.setCourse(course);
        }

        enrollmentDao.addEnrollment(enrollment);

        return enrollmentDao.setCourse(enrollment);
    }

 */

    public static Enrollment removeCourse(Integer enrollmentId, Integer courseId) {
        return enrollmentDao.removeCourse(enrollmentId, courseId);
    }

    public static Enrollment setStudent(Integer enrollmentId, String socialSecurity) {
        return enrollmentDao.setStudent(enrollmentId, socialSecurity);
    }

    public static Enrollment setGrade(Integer enrollmentId, Integer grade) {
        return enrollmentDao.gradeEnrollment(enrollmentId, grade);
    }
}
