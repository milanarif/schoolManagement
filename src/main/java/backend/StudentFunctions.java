package backend;

import dao.StudentDao;
import dao.StudentDaoImpl;
import entity.Student;

import java.util.List;

public class StudentFunctions {
    StudentDao studentDao = new StudentDaoImpl();

    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    public Student getStudent(String socialSecurity) {
        return studentDao.getStudent(socialSecurity);
    }

    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }

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

//    public Student changeCredits(String socialSecurity, double credits) {
//
//    }

    //TODO: IMPLEMENTERA getAlls, method for calculating credits from enrollments?
    //TODO: MAYBE ADD NAME TO ENROLLMENT FROM COURSE NAME AND THEN KEEP ENROLLMENTS DESPITE COURSE BEING REMOVED. MAYBE CREDITS SHOULD ONLY
    //TODO: BE CALULATED USING ENROLLMENT LIST!? LESS RISK OF STALE DATA!!
}
