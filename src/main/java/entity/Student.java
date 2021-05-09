package entity;

import java.io.Serializable;
import java.util.ArrayList;
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
    private double credits;

    @Basic
    private String gender;

    @ManyToOne(targetEntity = Department.class)
    private Department department;

    @OneToMany(targetEntity = Enrollment.class,mappedBy = "student")
    private List<Enrollment> enrollments;

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

    public double getCredits() {
        return this.credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
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
        this.department = department;
    }

    public List<Enrollment> getEnrollments() {
        return this.enrollments;
    }

    public void setEnrollments(List<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }

    @Override
    public String toString() {
        return
                socialSecurity + " " +
                name + " " +
                credits + " " +
                gender + " " +
                department + " " +
                enrollments;
    }

    public Student() {
    }
}
