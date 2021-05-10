package entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Student implements Serializable { 

    @Id
    private String socialSecurity;

    @Basic
    private String name;

    @Basic
    private String gender;

    @ManyToOne(targetEntity = Department.class)
    private Department department;

    @OneToMany(targetEntity = Enrollment.class,mappedBy = "student")
    private List<Enrollment> enrollments;

    public Student() {
    }

    public Student(String socialSecurity, String name, String gender) {
        this.socialSecurity = socialSecurity;
        this.name = name;
        this.gender = gender;
    }

    public String getSocialSecurity() {
        return this.socialSecurity;
    }

    public void setSocialSecurity(String socialSecurity) {
        this.socialSecurity = socialSecurity;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Department getDepartment() {
        return this.department;
    }

    public void setDepartment(Department department) {
        if (this.department != null) {
            this.department.internalRemoveStudent(this);
        }
        this.department = department;
        if (department != null) {
            department.internalAddStudent(this);
        }
    }

    public List<Enrollment> getEnrollments() {
        return this.enrollments;
    }

    public void setEnrollments(List<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }

    public void removeEnrollment(Enrollment enrollment) {
        enrollment.setStudent(this);
    }

    public void addEnrollment(Enrollment enrollment) {
        enrollment.setStudent(null);
    }

    public void internalAddEnrollment(Enrollment enrollment) {
        enrollments.add(enrollment);
    }

    public void internalRemoveEnrollment(Enrollment enrollment) {
        enrollments.remove(enrollment);
    }
}
