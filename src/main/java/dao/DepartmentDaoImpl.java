package dao;

import entity.Course;
import entity.Department;

import javax.persistence.EntityManager;

public class DepartmentDaoImpl implements DepartmentDao{
    @Override
    public Department getDepartment(Integer departmentId) {
        EntityManager em = Connector.emf.createEntityManager();
        Department department = em.find(Department.class, departmentId);
        em.close();
        return department;
    }

    @Override
    public void addDepartment(Department department) {
        EntityManager em = Connector.emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(department);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void deleteDepartment(Integer departmentId) {
        EntityManager em = Connector.emf.createEntityManager();
        Course course = em.find(Course.class, departmentId);

        if (course != null) {
            em.getTransaction().begin();
            em.remove(course);
            em.getTransaction().commit();
        }
        em.close();
    }

    @Override
    public void updateDepartmentName(Integer departmentId, String newName) {
        EntityManager em = Connector.emf.createEntityManager();
        Department department = em.find(Department.class, departmentId);

        if (department != null) {
            em.getTransaction().begin();
            department.setName(newName);
            em.getTransaction().commit();
        }
        em.close();
    }
}
