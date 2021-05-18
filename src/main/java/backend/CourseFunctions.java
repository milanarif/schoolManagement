package backend;

import dao.CourseDao;
import dao.CourseDaoImpl;
import entity.Course;
import entity.Enrollment;
import entity.Teacher;

import java.util.List;

public class CourseFunctions {
    static CourseDao courseDao = new CourseDaoImpl();

    public static Course getCourse(Integer courseId) {
        return courseDao.getCourse(courseId);
    }

    public static List<Course> getAllCourses() {
        return courseDao.getAllCourses();
    }

    public static void addCourse(Course course) {
        courseDao.addCourse(course);
    }

    public static void removeCourse(Integer courseId) {
        Course target = courseDao.getCourse(courseId);
        List<Teacher> teachers = target.getTeachers();
        List<Enrollment> enrollments = target.getEnrollments();
        for (Teacher t : teachers) {
            TeacherFunctions.removeCourse(t.getSocialSecurity(), courseId);
        }
        for (Enrollment e : enrollments) {
            EnrollmentFunctions.removeCourse(e.getId());
        }
        courseDao.removeCourse(courseId);
    }

    public static Course setDepartment(Integer courseId, Integer departmentId) {
        return courseDao.setDepartment(courseId, departmentId);
    }

    public static Course removeDepartment(Integer courseId) {
        return courseDao.removeDepartment(courseId);
    }

    public static Course setName(Integer courseId, String name) {
        return courseDao.setName(courseId, name);
    }

    public static Course setCredits(Integer courseId, double credits) {
        return courseDao.setCredits(courseId, credits);
    }}
