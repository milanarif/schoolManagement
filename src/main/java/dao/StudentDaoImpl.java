package dao;

import entity.Course;
import entity.Department;
import entity.Enrollment;
import entity.Student;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class StudentDaoImpl implements StudentDao{

   @Override
   public List<Student> getAllStudentsCourse(Integer courseId){
       EntityManager em = Connector.getEmf().createEntityManager();
       TypedQuery<Course> q = em.createQuery("Select c from Course c where c.courseId = :course_id", Course.class);
       q.setParameter("course_id", courseId);

       Course c = q.getSingleResult();

       em.close();

      List<Student> students = c.getDepartment().getStudents();
return students;


   }


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
        em.close();
      
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
    public Student setName(String socialSecurity, String newName) {
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

    @Override
    public Student removeDepartment(String socialSecurity) {
        EntityManager em = Connector.getEmf().createEntityManager();
        Student student = em.find(Student.class, socialSecurity);

        if (student != null && student.getDepartment() != null) {
            em.getTransaction().begin();
            student.setDepartment(null);
            em.getTransaction().commit();
        }
        em.close();

        return student;
    }
}
