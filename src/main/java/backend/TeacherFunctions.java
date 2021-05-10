package backend;

import dao.TeacherDao;
import dao.TeacherDaoImpl;
import entity.Teacher;

import java.util.List;

public class TeacherFunctions {
    static TeacherDao teacherDao = new TeacherDaoImpl();

    //TODO: IMPLEMENT GET ALL FOR ALL CLASSES!
    public static List<Teacher> getAllTeachers() {
        return teacherDao.getAllTeachers();
    }

    public static Teacher getTeacher(String socialSecurity) {
        return teacherDao.getTeacher(socialSecurity);
    }

    public static void addTeacher(Teacher teacher) {
        teacherDao.addTeacher(teacher);
    }

    public static Teacher removeTeacher(String socialSecurity) {
        return teacherDao.removeTeacher(socialSecurity);
    }

    public static Teacher setName(String socialSecurity, String newName) {
        return teacherDao.setName(socialSecurity, newName);
    }

    public static Teacher setDepartment(String socialSecurity, Integer departmentId) {
        return teacherDao.setDepartment(socialSecurity, departmentId);
    }

    public static Teacher setCourse(String socialSecurity, Integer courseId) {
        return teacherDao.addCourse(socialSecurity, courseId);
    }
}
