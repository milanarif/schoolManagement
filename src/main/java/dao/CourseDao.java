package dao;

import entity.Course;

public interface CourseDao {
    public Course getCourse(Integer courseId);
    public void addCourse(Course course);
    public Course removeCourse(Integer courseId);
    public Course updateCourseName(Integer courseId, String newName);
    public Course updateCourseCredits(Integer courseId, double newCredits);
    public Course setDepartment(Integer courseId, Integer departmentId);
}
