package dao;

import entity.Course;
import entity.Department;
import entity.Enrollment;
import entity.Student;

import javax.persistence.EntityManager;

public class CourseDaoImpl implements CourseDao {

    @Override
    public Course getCourse(Integer courseId) {
        EntityManager em = Connector.getEmf().createEntityManager();
        Course course = em.find(Course.class, courseId);
        em.close();
        return course;
    }

    @Override
    public void addCourse(Course course) {
        EntityManager em = Connector.getEmf().createEntityManager();
        em.getTransaction().begin();
        em.persist(course);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public Course removeCourse(Integer courseId) {
        EntityManager em = Connector.getEmf().createEntityManager();
        Course course = em.find(Course.class, courseId);

        if (course != null) {
            em.getTransaction().begin();
            em.remove(course);
            em.getTransaction().commit();
        }
        em.close();
        return course;
    }

    @Override
    public Course updateCourseName(Integer courseId, String newName) {
        EntityManager em = Connector.getEmf().createEntityManager();
        Course course = em.find(Course.class, courseId);

        if (course != null) {
            em.getTransaction().begin();
            course.setName(newName);
            em.getTransaction().commit();
        }
        em.close();
        return course;
    }

    @Override
    public Course updateCourseCredits(Integer courseId, double newCredits) {
        EntityManager em = Connector.getEmf().createEntityManager();
        Course course = em.find(Course.class, courseId);

        if (course != null) {
            em.getTransaction().begin();
            course.setCredits(newCredits);
            em.getTransaction().commit();
        }
        em.close();
        return course;
    }

    @Override
    public Course setDepartment(Integer courseId, Integer departmentId) {
        EntityManager em = Connector.getEmf().createEntityManager();
        Course course = em.find(Course.class, courseId);
        Department department = em.find(Department.class, departmentId);

        if (course != null) {
            em.getTransaction().begin();
            course.setDepartment(department);
            em.getTransaction().commit();
        }
        em.close();

        return course;
    }
}
