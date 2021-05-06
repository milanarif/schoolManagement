package dao;

import entity.Student;
import entity.Teacher;

import javax.persistence.EntityManager;

public class TeacherDaoImpl implements TeacherDao{
    @Override
    public Teacher getTeacher(String socialSecurity) {
        EntityManager em = Connector.emf.createEntityManager();
        Teacher teacher = em.find(Teacher.class, socialSecurity);
        em.close();
        return teacher;
    }

    @Override
    public void addTeacher(Teacher teacher) {
        EntityManager em = Connector.emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(teacher);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void deleteTeacher(String socialSecurity) {
        EntityManager em = Connector.emf.createEntityManager();
        Teacher teacher = em.find(Teacher.class, socialSecurity);

        if (teacher != null) {
            em.getTransaction().begin();
            em.remove(teacher);
            em.getTransaction().commit();
        }
        em.close();
    }

    @Override
    public void updateTeacherName(String socialSecurity, String newName) {
        EntityManager em = Connector.emf.createEntityManager();
        Teacher teacher = em.find(Teacher.class, socialSecurity);

        if (teacher != null) {
            em.getTransaction().begin();
            teacher.setName(newName);
            em.getTransaction().commit();
        }
        em.close();
    }
}
