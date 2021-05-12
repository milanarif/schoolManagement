package dao;

import entity.Course;
import entity.Teacher;

import java.util.List;

public interface TeacherDao {
    Teacher getTeacher(String socialSecurity);
    List<Teacher> getAllTeachers();
    void addTeacher(Teacher teacher);
    Teacher removeTeacher(String socialSecurity);
    Teacher setName(String socialSecurity, String newName);
    Teacher setDepartment(String socialSecurity, Integer departmentId);
    Teacher setCourse(String socialSecurity, Integer courseId);
    Teacher removeCourse(Course course);
   // Teacher removeCourse(String socialSecurity, Integer courseId);
}