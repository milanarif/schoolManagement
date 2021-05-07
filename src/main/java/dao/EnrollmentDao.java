package dao;

import entity.Enrollment;

public interface EnrollmentDao {
    public Enrollment getEnrollment(Integer enrollmentId);
    public void addEnrollment(Enrollment enrollment);
    public Enrollment removeEnrollment(Integer enrollmentId);
    public Enrollment gradeEnrollment(Integer enrollmentId, Integer grade);
    public Enrollment setCourse(Integer enrollmentId, Integer courseId);
    public Enrollment setStudent(Integer enrollmentId, String socialSecurity);
}
