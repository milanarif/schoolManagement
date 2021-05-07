package dao;

public interface TeacherDao {
    public TeacherDao getTeacher(String socialSecurity);
    public void addTeacher(String socialSecurity, String name, String gender);
    public void deleteTeacher(String socialSecurity);
    public void updateTeacherName(String socialSecurity, String newName);
}
