package dao;

import entity.Course;

import java.util.List;

public interface CourseDao {
    public Course getCourse(Integer courseId);
    public List<Course> getAllCourses();
    public void addCourse(Course course);
    public Course removeCourse(Integer courseId);
    public Course updateCourseName(Integer courseId, String newName);
    public Course updateCourseCredits(Integer courseId, double newCredits);
    public Course setDepartment(Integer courseId, Integer departmentId);
}
