package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class Course implements Serializable { 

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer courseId;

    @Basic
    private String name;

    @Basic
    private double credits;

    @ManyToOne(targetEntity = Department.class)
    private Department department;

    @OneToMany(targetEntity = Enrollment.class,mappedBy = "course", fetch = FetchType.EAGER)
    private List<Enrollment> enrollments;

    @ManyToMany(targetEntity = Teacher.class,mappedBy = "courses", fetch = FetchType.EAGER)
    private List<Teacher> teachers;

    public Course() {
    }

    public Course(String name, double credits) {
        this.name = name;
        this.credits = credits;
    }

    public Integer getCourseId() {
        return this.courseId;
    }

    public void setCourseId(Integer classId) {
        this.courseId = classId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCredits() {
        return this.credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public Department getDepartment() {
        return this.department;
    }

    public void setDepartment(Department department) {
        if (this.department != null) {
            this.department.internalRemoveCourse(this);
        }
        this.department = department;
        if (department != null) {
            department.internalAddCourse(this);
        }
    }

    public List<Enrollment> getEnrollments() {
        if (this.enrollments == null) {
            this.enrollments = new ArrayList<>();
        }
        return this.enrollments;
    }

    public void setEnrollments(List<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }

    public void addEnrollment(Enrollment enrollment) {
        enrollment.setCourse(this);
    }

    public void removeEnrollment(Enrollment enrollment) {
        enrollment.setCourse(null);
    }

    public void internalAddEnrollment(Enrollment enrollment) {
        enrollments.add(enrollment);
    }

    public void internalRemoveEnrollment(Enrollment enrollment) {
        enrollments.remove(enrollment);
    }

    public List<Teacher> getTeachers() {
        if (this.teachers == null) {
            this.teachers = new ArrayList<>();
        }
        return this.teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public void addTeacher(Teacher teacher) {
        teacher.addCourse(this);
    }

    public void removeTeacher(Teacher teacher) {
        teacher.removeCourse(this);
    }

    public void internalAddTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void internalRemoveTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o ) {
            return true;
        }
        if (o instanceof Course) {
            if (((Course) o).getCourseId().equals(this.courseId)){
                return true;
            }
            else return false;
        }
        return false;
    }

}
