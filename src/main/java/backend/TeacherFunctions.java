package backend;

import dao.TeacherDao;
import dao.TeacherDaoImpl;
import entity.Teacher;

import java.util.List;

public class TeacherFunctions {
    TeacherDao teacherDao = new TeacherDaoImpl();

    //TODO: IMPLEMENT GET ALL FOR ALL CLASSES!
    public List<Teacher> getAllTeachers() {
        getAllTeachers().forEach(System.out::println);

        return getAllTeachers();
    }

    public Teacher getTeacher(String socialSecurity) {
        return teacherDao.getTeacher(socialSecurity);
    }

    public static void addTeacher(Teacher teacher) {
        TeacherDao td = new TeacherDaoImpl();
        td.addTeacher(teacher);
    }
/*
    public Teacher removeTeacher(String socialSecurity) {
        return teacherDao.removeTeacher(socialSecurity);
    }

    public Teacher updateTeacherName(String socialSecurity, String newName) {
        return teacherDao.updateTeacherName(socialSecurity, newName);
    }

    public Teacher setDepartment(String socialSecurity, Integer departmentId) {
        return teacherDao.setDepartment(socialSecurity, departmentId);
    }
*/
}
