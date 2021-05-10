package dao;

import entity.Course;
import entity.Department;

import java.util.List;

public interface DepartmentDao {
    Department getDepartment(Integer departmentId);
    List<Department> getAllDepartments();
    void addDepartment(Department department);
    Department removeDepartment(Integer departmentId);
    Department setName(Integer departmentId, String newName);
}
