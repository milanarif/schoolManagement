package dao;

import entity.Course;
import entity.Department;

import javax.persistence.EntityManager;
import java.util.List;

public class DepartmentDaoImpl implements DepartmentDao{
    @Override
    public Department getDepartment(Integer departmentId) {
        EntityManager em = Connector.getEmf().createEntityManager();
        Department department = em.find(Department.class, departmentId);
        em.close();
        return department;
    }

    @Override
    public List<Department> getAllDepartments() {
        EntityManager em = Connector.getEmf().createEntityManager();
        List<Department> departments = em
                .createQuery("Select d from Department d", Department.class)
                .getResultList();
        return departments;
    }

    @Override
    public void addDepartment(Department department) {
        EntityManager em = Connector.getEmf().createEntityManager();
        em.getTransaction().begin();
        em.persist(department);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public Department removeDepartment(Integer departmentId) {
        EntityManager em = Connector.getEmf().createEntityManager();
        Department department = em.find(Department.class, departmentId);

        if (department != null) {
            em.getTransaction().begin();
            em.remove(department);
            em.getTransaction().commit();
        }
        em.close();
        return department;
    }

    @Override
    public Department updateDepartmentName(Integer departmentId, String newName) {
        EntityManager em = Connector.getEmf().createEntityManager();
        Department department = em.find(Department.class, departmentId);

        if (department != null) {
            em.getTransaction().begin();
            department.setName(newName);
            em.getTransaction().commit();
        }
        em.close();
        return department;
    }
}
