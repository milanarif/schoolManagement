package dao;

import entity.Course;

public interface CourseDao {
    public Course getCourse(Integer classId);
    public void addCourse(String name, double credits);
    public void deleteCourse(Integer classId);
    public void updateCourseName(Integer classId, String newName);
    public void updateCourseCredits(Integer classId, double newCredits);
}
