package backend;

import dao.Connector;
import dao.StudentDao;
import dao.StudentDaoImpl;
import entity.Student;
import main.Input;
import main.Print;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class StudentFunctions {
    StudentDao studentDao = new StudentDaoImpl();

    public void getAllStudents(Student students) {
        EntityManager em = Connector.emf.createEntityManager();

        TypedQuery<Student> s = em.createQuery("SELECT s From Student s", Student.class);

        List<Student> studentList = s.getResultList();

        printStudents(studentList);
    }

    public void printStudents(List<Student> studentList){
        Print.printStudentHead();
        studentList.forEach(Print::printStudent);
    }

    public Student getStudent(String socialSecurity) {
        return studentDao.getStudent(socialSecurity);
    }

    public static void addStudent(Student student) {
        StudentDao sd = new StudentDaoImpl();
        sd.addStudent(student);
        //studentDao.addStudent(student);
    }
/*
    public Student removeStudent(String socialSecurity) {
        return studentDao.removeStudent(socialSecurity);
    }


    public Student updateStudentName(String socialSecurity, String newName) {
        return studentDao.updateStudentName(socialSecurity, newName);
    }

    public Student setDepartment(String socialSecurity, Integer departmentId) {
        return studentDao.setDepartment(socialSecurity, departmentId);
    }

    public Student addCredits(String socialSecurity, double credits) {
        return studentDao.addCredits(socialSecurity, credits);
    }

    public Student changeCredits(String socialSecurity, double credits) {

    }

    //TODO: IMPLEMENTERA getAlls, method for calculating credits from enrollments?
    */

}
