package dao;

import entity.Course;

import java.util.List;

public interface CourseDao {
    Course getCourse(Integer courseId);
    List<Course> getAllCourses();
    void addCourse(Course course);
    Course removeCourse(Integer courseId);
    Course setName(Integer courseId, String newName);
    Course setCredits(Integer courseId, double newCredits);
    Course setDepartment(Integer courseId, Integer departmentId);
    Course removeDepartment(Integer courseId);
}
