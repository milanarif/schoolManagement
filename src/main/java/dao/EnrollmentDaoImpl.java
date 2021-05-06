package dao;

import entity.Course;
import entity.Department;
import entity.Enrollment;

import javax.persistence.EntityManager;

public class EnrollmentDaoImpl implements EnrollmentDao{

    @Override
    public Enrollment getEnrollment(Integer enrollmentId) {
        EntityManager em = Connector.emf.createEntityManager();
        Enrollment enrollment = em.find(Enrollment.class, enrollmentId);
        em.close();
        return enrollment;
    }

    @Override
    public void addEnrollment(Enrollment enrollment) {
        EntityManager em = Connector.emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(enrollment);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void deleteEnrollment(Integer enrollmentId) {
        EntityManager em = Connector.emf.createEntityManager();
        Enrollment enrollment = em.find(Enrollment.class, enrollmentId);

        if (enrollment != null) {
            em.getTransaction().begin();
            em.remove(enrollment);
            em.getTransaction().commit();
        }
        em.close();
    }

    @Override
    public void gradeEnrollment(Integer enrollmentId, Integer grade) {
        EntityManager em = Connector.emf.createEntityManager();
        Enrollment enrollment = em.find(Enrollment.class, enrollmentId);

        if (enrollment != null) {
            em.getTransaction().begin();
            enrollment.setGrade(grade);
            em.getTransaction().commit();
        }
        em.close();
    }
}
