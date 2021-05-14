package backend;

import dao.DepartmentDao;
import dao.DepartmentDaoImpl;
import entity.Course;
import entity.Department;
import entity.Student;
import entity.Teacher;

import java.util.List;

public class DepartmentFunctions {
    static DepartmentDao departmentDao = new DepartmentDaoImpl();

    public static List<Department> getAllDepartments(){ return departmentDao.getAllDepartments(); }

    public static void addDepartment(Department department) {
        departmentDao.addDepartment(department);
    }

    public static Department removeDepartment(Integer departmentId) {
        Department target = departmentDao.getDepartment(departmentId);
        List<Course> courses = target.getCourses();
        for (Course c : courses) {
            CourseFunctions.removeDepartment(c.getCourseId());
        }
        List<Teacher> teachers = target.getTeachers();
        for (Teacher t : teachers) {
            TeacherFunctions.removeDepartment(t.getSocialSecurity());
        }
        List<Student> students = target.getStudents();
        for (Student s : students) {
            StudentFunctions.removeDepartment(s.getSocialSecurity());
        }
        return departmentDao.removeDepartment(departmentId);
    }

    public static Department setName(Integer departmentId, String name) {
        return departmentDao.setName(departmentId, name);
    }

    public static Department getDepartment(Integer departmentId) {
        return departmentDao.getDepartment(departmentId);
    }
}