package dao;

import entity.Enrollment;

public interface EnrollmentDao {
    public Enrollment getEnrollment(Integer enrollmentId);
    public void addEnrollment(Enrollment enrollment);
    public void deleteEnrollment(Integer enrollmentId);
    public void gradeEnrollment(Integer enrollmentId, Integer grade);
}
