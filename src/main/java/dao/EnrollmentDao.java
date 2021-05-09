package dao;

import entity.Enrollment;

import java.util.List;

public interface EnrollmentDao {
    public Enrollment getEnrollment(Integer enrollmentId);
    public List<Enrollment> getAllEnrollments();
    public void addEnrollment(Enrollment enrollment);
    public Enrollment removeEnrollment(Integer enrollmentId);
    public Enrollment gradeEnrollment(Integer enrollmentId, Integer grade);
    public Enrollment setCourse(Integer enrollmentId, Integer courseId);
    public Enrollment setStudent(Integer enrollmentId, String socialSecurity);
}
