package backend;

import dao.CourseDao;
import dao.CourseDaoImpl;
import entity.Course;

import java.util.List;

public class CourseFunctions {
    CourseDao courseDao = new CourseDaoImpl();

    public Course getCourse(Integer courseId) {
        return courseDao.getCourse(courseId);
    }
/*
    public List<Course> getAllCourses() {

    }

    public void addCourse(Course course) {
        courseDao.addCourse(course);
    }

    public Course removeCourse(Integer courseId) {
        return courseDao.removeCourse(courseId);
    }

    public Course setDepartment(Integer courseId, Integer departmentId) {
        return courseDao.setDepartment(courseId, departmentId);
    }

*/
}
