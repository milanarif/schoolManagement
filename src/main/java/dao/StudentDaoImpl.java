package dao;

import entity.Course;
import entity.Department;
import entity.Enrollment;
import entity.Student;

import javax.persistence.EntityManager;
import java.util.List;

public class StudentDaoImpl implements StudentDao{
    @Override
    public Student getStudent(String socialSecurity) {
        EntityManager em = Connector.getEmf().createEntityManager();
        Student student = em.find(Student.class, socialSecurity);
        em.close();
        return student;
    }

    @Override
    public List<Student> getAllStudents() {
        EntityManager em = Connector.getEmf().createEntityManager();
        List<Student> students = em
                .createQuery("Select s from Student s", Student.class)
                .getResultList();
        return students;
    }

    @Override
    public void addStudent(Student student) {
        EntityManager em = Connector.getEmf().createEntityManager();
        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public Student removeStudent(String socialSecurity) {
        EntityManager em = Connector.getEmf().createEntityManager();
        Student student = em.find(Student.class, socialSecurity);

        if (student != null) {
            em.getTransaction().begin();
            em.remove(student);
            em.getTransaction().commit();
        }
        em.close();
        return student;
    }

    @Override
    public Student updateStudentName(String socialSecurity, String newName) {
        EntityManager em = Connector.getEmf().createEntityManager();
        Student student = em.find(Student.class, socialSecurity);

        if (student != null) {
            em.getTransaction().begin();
            student.setName(newName);
            em.getTransaction().commit();
        }
        em.close();
        return student;
    }

    @Override
    public Student addCredits(String socialSecurity, double credits) {
        EntityManager em = Connector.getEmf().createEntityManager();
        Student student = em.find(Student.class, socialSecurity);

        if (student != null) {
            double currentCredits = student.getCredits();
            em.getTransaction().begin();
            student.setCredits(currentCredits + credits);
            em.getTransaction().commit();
        }
        em.close();
        return student;
    }

    @Override
    public Student updateCredits(String socialSecurity, double newCredits) {
        EntityManager em = Connector.getEmf().createEntityManager();
        Student student = em.find(Student.class, socialSecurity);

        if (student != null) {
            em.getTransaction().begin();
            student.setCredits(newCredits);
            em.getTransaction().commit();
        }
        em.close();
        return student;
    }

    @Override
    public Student setDepartment(String socialSecurity, Integer departmentId) {
        EntityManager em = Connector.getEmf().createEntityManager();
        Student student = em.find(Student.class, socialSecurity);
        Department department = em.find(Department.class, departmentId);

        if (student != null) {
            em.getTransaction().begin();
            student.setDepartment(department);
            em.getTransaction().commit();
        }
        em.close();

        return student;
    }
}
