package dao;

import entity.Teacher;

public interface TeacherDao {
    public Teacher getTeacher(String socialSecurity);
    public void addTeacher(Teacher teacher);
    public Teacher removeTeacher(String socialSecurity);
    public Teacher updateTeacherName(String socialSecurity, String newName);
    public Teacher setDepartment(String socialSecurity, Integer departmentId);
    public Teacher addCourse(String socialSecurity, Integer courseId);
}
