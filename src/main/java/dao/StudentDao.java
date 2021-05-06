package dao;

import entity.Student;

public interface StudentDao {
    public Student getStudent(String socialSecurity);
    public void addStudent(String socialSecurity, String name, double credits, String gender);
    public void deleteStudent(String socialSecurity);
    public void updateStudentName(String socialSecurity, String newName);
    public void addCredits(String socialSecurity, double credits);
    public void updateCredits(String socialSecurity, double newCredits);
}
