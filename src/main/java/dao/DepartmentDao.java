package dao;

import entity.Department;

public interface DepartmentDao {
    public Department getDepartment(Integer departmentId);
    public void addDepartment(Department department);
    public Department removeDepartment(Integer departmentId);
    public Department updateDepartmentName(Integer departmentId, String newName);
}
