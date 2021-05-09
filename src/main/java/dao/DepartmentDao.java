package dao;

import entity.Course;
import entity.Department;

import java.util.List;

public interface DepartmentDao {
    public Department getDepartment(Integer departmentId);
    public List<Department> getAllDepartments();
    public void addDepartment(Department department);
    public Department removeDepartment(Integer departmentId);
    public Department updateDepartmentName(Integer departmentId, String newName);
}
