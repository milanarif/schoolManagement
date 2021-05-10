package backend;

import dao.DepartmentDao;
import dao.DepartmentDaoImpl;
import entity.Department;

import java.util.List;

public class DepartmentFunctions {
    static DepartmentDao departmentDao = new DepartmentDaoImpl();

    public static List<Department> getAllDepartments(){ return departmentDao.getAllDepartments(); }

    public static void addDepartment(Department department) {
        departmentDao.addDepartment(department);
    }

    public static Department removeDepartment(Integer departmentId) {
        return departmentDao.removeDepartment(departmentId);
    }

    public static Department setName(Integer departmentId, String name) {
        return departmentDao.setName(departmentId, name);
    }
}