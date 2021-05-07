package dao;

import entity.Teacher;

public interface TeacherDao {
    public Teacher getTeacher(String socialSecurity);
    public void addTeacher(Teacher teacher);
    public void deleteTeacher(String socialSecurity);
    public void updateTeacherName(String socialSecurity, String newName);
}
