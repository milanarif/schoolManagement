package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Teacher implements Serializable { 

    @Id
    private String socialSecurity;

    @Basic
    private String name;

    @Basic
    private String gender;

    @ManyToOne(targetEntity = Department.class)
    private Department department;

    @ManyToMany(targetEntity = Course.class)
    private List<Course> courses;

    public Teacher() {
    }

    public Teacher(String socialSecurity, String name, String gender) {
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
            this.department.internalRemoveTeacher(this);
        }
        this.department = department;
        if (department != null) {
            department.internalAddTeacher(this);
        }
    }

    public List<Course> getCourses() {
        return this.courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    //Line

    public void addCourse(Course course){
        if (this.courses == null) {
            this.courses = new ArrayList<>();
        }
        if (!this.courses.contains(course)) {
            this.courses.add(course);
        }
        if (course != null) {
            course.internalAddTeacher(this);
        }
    }

    public void removeCourse(Course course) {
        if (this.courses != null) {
            this.courses.remove(course);
        }
    }
}
