package dao;

import entity.Department;
import entity.Enrollment;
import entity.Student;

import javax.persistence.EntityManager;

public class StudentDaoImpl implements StudentDao{
    @Override
    public Student getStudent(String socialSecurity) {
        EntityManager em = Connector.emf.createEntityManager();
        Student student = em.find(Student.class, socialSecurity);
        em.close();
        return student;
    }

    @Override
    public void addStudent(Student student) {
        EntityManager em = Connector.emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void deleteStudent(String socialSecurity) {
        EntityManager em = Connector.emf.createEntityManager();
        Student student = em.find(Student.class, socialSecurity);

        if (student != null) {
            em.getTransaction().begin();
            em.remove(student);
            em.getTransaction().commit();
        }
        em.close();
    }

    @Override
    public void updateStudentName(String socialSecurity, String newName) {
        EntityManager em = Connector.emf.createEntityManager();
        Student student = em.find(Student.class, socialSecurity);

        String socialSecurityUpdate = mainAndInput.input.inputString();
        student.setSocialSecurity(socialSecurityUpdate);

        if (student != null) {
            em.getTransaction().begin();
            student.setName(newName);
            em.getTransaction().commit();
        }
        em.close();
    }

    @Override
    public void addCredits(String socialSecurity, double credits) {
        EntityManager em = Connector.emf.createEntityManager();
        Student student = em.find(Student.class, socialSecurity);

        if (student != null) {
            double currentCredits = student.getCredits();
            em.getTransaction().begin();
            student.setCredits(currentCredits + credits);
            em.getTransaction().commit();
        }
        em.close();
    }

    @Override
    public void updateCredits(String socialSecurity, double newCredits) {
        EntityManager em = Connector.emf.createEntityManager();
        Student student = em.find(Student.class, socialSecurity);

        if (student != null) {
            em.getTransaction().begin();
            student.setCredits(newCredits);
            em.getTransaction().commit();
        }
        em.close();
    }
}
