package dao;

import entity.Department;

public interface DepartmentDao {
    public Department getDepartment(Integer departmentId);
    public void addDepartment(String name);
    public void deleteDepartment(Integer departmentId);
    public void updateDepartmentName(Integer departmentId, String newName);
}
