package dao;

import entity.Enrollment;

import java.util.List;

public interface EnrollmentDao {
    Enrollment getEnrollment(Integer enrollmentId);
    List<Enrollment> getAllEnrollments();
    void addEnrollment(Enrollment enrollment);
    Enrollment removeEnrollment(Integer enrollmentId);
    Enrollment gradeEnrollment(Integer enrollmentId, Integer grade);
    Enrollment setCourse(Integer enrollmentId, Integer courseId);
    Enrollment setCourse(Enrollment enrollment);
    Enrollment setStudent(Integer enrollmentId, String socialSecurity);
    Enrollment removeCourse(Integer enrollmentId, Integer courseId);}
