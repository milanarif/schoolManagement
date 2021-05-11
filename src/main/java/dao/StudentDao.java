package dao;

import entity.Student;

import java.util.List;

public interface StudentDao {
    Student getStudent(String socialSecurity);
    List<Student> getAllStudents();
    void addStudent(Student student);
    Student removeStudent(String socialSecurity);
    Student setName(String socialSecurity, String newName);
    Student setDepartment(String socialSecurity, Integer departmentId);
    //Student setCourse(String socialSecurity, Integer departmentId);
}
