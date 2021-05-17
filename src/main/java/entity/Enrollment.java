package entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

@Entity
public class Enrollment implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer enrollmentId;

    @Basic
    private Integer grade;

    @ManyToOne(targetEntity = Student.class)
    private Student student;

    @ManyToOne(targetEntity = Course.class, cascade = CascadeType.ALL)
    private Course course;

    public Enrollment() {
    }

    public Enrollment(Integer grade) {
        this.grade = grade;
    }

    public Integer getId() {
        return this.enrollmentId;
    }

    public void setId(Integer Id) {
        this.enrollmentId = Id;
    }

    public Integer getGrade() {
        return this.grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Student getStudent() {
        return this.student;
    }

    public void setStudent(Student student) {
        if (this.student != null) {
            this.student.internalRemoveEnrollment(this);
        }
        this.student = student;
        if (student != null) {
            student.internalAddEnrollment(this);
        }
        this.student = student;
    }

    public Course getCourse() {
        return this.course;
    }

    public void setCourse(Course course) {
        if (this.course != null) {
            this.course.internalRemoveEnrollment(this);
        }
        this.course = course;
        if (course != null) {
            course.internalAddEnrollment(this);
        }
    }

    @Override
    public String toString() {
        return String.valueOf(enrollmentId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Enrollment that = (Enrollment) o;
        return Objects.equals(student, that.student) && Objects.equals(course, that.course);
    }
}

