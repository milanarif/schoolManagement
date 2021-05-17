package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

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

    @OneToMany(targetEntity = Enrollment.class,mappedBy = "student", fetch = FetchType.EAGER)
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
        if (this.enrollments == null) {
            this.enrollments = new ArrayList<>();
        }
        return this.enrollments;
    }

    public void setEnrollments(List<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }

    public void addEnrollment(Enrollment enrollment) {
        enrollment.setStudent(this);
    }

    public void removeEnrollment(Enrollment enrollment) {
        enrollment.setStudent(null);
    }

    public void internalAddEnrollment(Enrollment enrollment) {
        enrollments.add(enrollment);
    }

    public void internalRemoveEnrollment(Enrollment enrollment) {
        enrollments.remove(enrollment);
    }

    @Override
    public String toString() {
        return socialSecurity + " " +
                name + " " +
                gender + " " +
                department + " " +
                enrollments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o ) {
            return true;
        }
        if (o instanceof Student) {
            if (((Student) o).getSocialSecurity().equals(this.socialSecurity)){
                return true;
            }
            else return false;
        }
        return false;
    }
}
