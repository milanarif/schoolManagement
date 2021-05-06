package dao;

import entity.Course;

public interface CourseDao {
    public Course getCourse(Integer courseId);
    public void addCourse(Course course);
    public void deleteCourse(Integer courseId);
    public void updateCourseName(Integer courseId, String newName);
    public void updateCourseCredits(Integer courseId, double newCredits);
}
