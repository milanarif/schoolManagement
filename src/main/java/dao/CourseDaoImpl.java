package dao;

import entity.Course;

import javax.persistence.EntityManager;

public class CourseDaoImpl implements CourseDao {

    @Override
    public Course getCourse(Integer courseId) {
        EntityManager em = Connector.emf.createEntityManager();
        Course course = em.find(Course.class, courseId);
        em.close();
        return course;
    }

    @Override
    public void addCourse(Course course) {
        EntityManager em = Connector.emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(course);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void deleteCourse(Integer courseId) {
        EntityManager em = Connector.emf.createEntityManager();
        Course course = em.find(Course.class, courseId);

        if (course != null) {
            em.getTransaction().begin();
            em.remove(course);
            em.getTransaction().commit();
        }
        em.close();
    }

    @Override
    public void updateCourseName(Integer courseId, String newName) {
        EntityManager em = Connector.emf.createEntityManager();
        Course course = em.find(Course.class, courseId);

        if (course != null) {
            em.getTransaction().begin();
            course.setName(newName);
            em.getTransaction().commit();
        }
        em.close();
    }

    @Override
    public void updateCourseCredits(Integer courseId, double newCredits) {
        EntityManager em = Connector.emf.createEntityManager();
        Course course = em.find(Course.class, courseId);

        if (course != null) {
            em.getTransaction().begin();
            course.setCredits(newCredits);
            em.getTransaction().commit();
        }
        em.close();
    }
}
