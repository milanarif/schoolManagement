package entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Course implements Serializable { 

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer classId;

    @Basic
    private String name;

    @Basic
    private double credits;

    @ManyToOne(targetEntity = Department.class)
    private Department department;

    @OneToMany(targetEntity = Enrollment.class,mappedBy = "course")
    private List<Enrollment> enrollments;

    @ManyToMany(targetEntity = Teacher.class,mappedBy = "courses")
    private List<Teacher> teachers;

    public Integer getClassId() {
        return this.classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
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
        this.department = department;
    }

    public List<Enrollment> getEnrollments() {
        return this.enrollments;
    }

    public void setEnrollments(List<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }

    public List<Teacher> getTeachers() {
        return this.teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

}
