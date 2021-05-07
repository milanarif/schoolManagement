package dao;

import entity.Course;
import entity.Department;
import entity.Student;
import entity.Teacher;

import javax.persistence.EntityManager;

public class TeacherDaoImpl implements TeacherDao{
    @Override
    public Teacher getTeacher(String socialSecurity) {
        EntityManager em = Connector.getEmf().createEntityManager();
        Teacher teacher = em.find(Teacher.class, socialSecurity);
        em.close();
        return teacher;
    }

    @Override
    public void addTeacher(Teacher teacher) {
        EntityManager em = Connector.getEmf().createEntityManager();
        em.getTransaction().begin();
        em.persist(teacher);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public Teacher removeTeacher(String socialSecurity) {
        EntityManager em = Connector.getEmf().createEntityManager();
        Teacher teacher = em.find(Teacher.class, socialSecurity);

        if (teacher != null) {
            em.getTransaction().begin();
            em.remove(teacher);
            em.getTransaction().commit();
        }
        em.close();
        return teacher;
    }

    @Override
    public Teacher updateTeacherName(String socialSecurity, String newName) {
        EntityManager em = Connector.getEmf().createEntityManager();
        Teacher teacher = em.find(Teacher.class, socialSecurity);

        if (teacher != null) {
            em.getTransaction().begin();
            teacher.setName(newName);
            em.getTransaction().commit();
        }
        em.close();
        return teacher;
    }

    @Override
    public Teacher setDepartment(String socialSecurity, Integer departmentId) {
        EntityManager em = Connector.getEmf().createEntityManager();
        Teacher teacher = em.find(Teacher.class, socialSecurity);
        Department department = em.find(Department.class, departmentId);

        if (teacher != null) {
            em.getTransaction().begin();
            teacher.setDepartment(department);
            em.getTransaction().commit();
        }
        em.close();

        return teacher;
    }

    @Override
    public Teacher addCourse(String socialSecurity, Integer courseId) {
        EntityManager em = Connector.getEmf().createEntityManager();
        Teacher teacher = em.find(Teacher.class, socialSecurity);
        Course course = em.find(Course.class, courseId);

        if (teacher != null) {
            em.getTransaction().begin();
            teacher.addCourse(course);
            em.getTransaction().commit();
        }
        em.close();

        return teacher;
    }
}

