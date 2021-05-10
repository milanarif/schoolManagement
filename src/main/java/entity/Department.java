package entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department implements Serializable { 

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer departmentId;

    @Basic
    private String name;

    @OneToMany(targetEntity = Teacher.class,mappedBy = "department")
    private List<Teacher> teachers;

    @OneToMany(targetEntity = Course.class,mappedBy = "department")
    private List<Course> courses;

    @OneToMany(targetEntity = Student.class,mappedBy = "department")
    private List<Student> students;

    public Department() {
    }

    public Department(Integer departmentId, String name) {
        this.departmentId = departmentId;
        this.name = name;
    }

    public int getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Teacher> getTeachers() {
        return this.teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public void addTeacher(Teacher teacher) {
        teacher.setDepartment(this);
    }

    public void removeTeacher(Teacher teacher) {
        teacher.setDepartment(null);
    }

    public void internalAddTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void internalRemoveTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }

    public List<Course> getCourses() {
        return this.courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void addCourse(Course course) {
        course.setDepartment(this);
    }

    public void removeCourse(Course course) {
        course.setDepartment(null);
    }

    public void internalAddCourse(Course course) {
        courses.add(course);
    }

    public void internalRemoveCourse(Course course) {
        courses.remove(course);
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        student.setDepartment(this);
    }

    public void removeStudent(Student student) {
        student.setDepartment(null);
    }

    public void internalAddStudent(Student student) {
        students.add(student);
    }

    public void internalRemoveStudent(Student student) {
        students.remove(student);
    }
}
