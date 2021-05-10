package dao;

import entity.Student;

import java.util.List;

public interface StudentDao {
    public Student getStudent(String socialSecurity);
    public List<Student> getAllStudents();
    public void addStudent(Student student);
    public Student removeStudent(String socialSecurity);

    void deleteStudent(String socialSecurity);

    public void updateStudentName(String socialSecurity, String newName);
    public void addCredits(String socialSecurity, double credits);
    public void updateCredits(String socialSecurity, double newCredits);
    public Student setDepartment(String socialSecurity, Integer departmentId);
}
