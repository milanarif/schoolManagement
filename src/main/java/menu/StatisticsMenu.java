package menu;

import backend.CourseFunctions;
import backend.DepartmentFunctions;
import backend.StudentFunctions;
import entity.Course;
import entity.Department;
import entity.Student;
import frontend.StatisticsFunctions;
import main.Main;
import main.Input;

public class StatisticsMenu {

    public static void menu() {

        System.out.println("\nSTATISTICS MENU");
        System.out.println("---------------");
        System.out.println("1. Pass Ratio Course");
        System.out.println("2. Pass Ratio Student");
        System.out.println("3. Gender Ratio Course");
        System.out.println("4. Gender Ratio Department");
        System.out.println("5. Amount of Persons in School");

        System.out.println("\n6. Return");
        System.out.println("8. Main Menu");
        System.out.println("---------------");

        System.out.print("choice: ");
        Integer choice = Input.inputInt();
        Integer courseId;
        String socialSecurity;
        Integer departmentId;
        switch (choice) {
            case 1:
                System.out.print("Course ID: ");
                courseId = Input.inputInt();
                Course course = CourseFunctions.getCourse(courseId);
                if(course != null)
                    StatisticsFunctions.passRatio(course.getEnrollments());
                else
                    System.out.println("\nCourse (" + courseId + ") Not Found!");
                menu();
                break;
            case 2:
                System.out.print("Student SSN (YYYYMMDD-XXXX): ");
                socialSecurity = Input.inputString();
                Student student = StudentFunctions.getStudent(socialSecurity);
                if(student != null)
                    StatisticsFunctions.passRatio(student.getEnrollments());
                else
                    System.out.println("\n Student (" + socialSecurity + ") Not Found!");
                menu();
                break;
            case 3:
                System.out.print("Course ID: ");
                courseId = Input.inputInt();

                Course courseGender = CourseFunctions.getCourse(courseId);
                if(courseGender !=null)
                    StatisticsFunctions.genderRatioCourse(courseGender.getEnrollments());
                else
                    System.out.println("\nCourse (" + courseId + ") Not Found!");
                menu();
                break;
            case 4:
                System.out.print("Department ID: ");
                departmentId = Input.inputInt();

                Department department = DepartmentFunctions.getDepartment(departmentId);
                if(department != null)
                    StatisticsFunctions.genderRatioDepartment(department.getStudents());
                else
                    System.out.println("\nDepartment (" + departmentId +") Not Found!");
                menu();
                break;
            case 5:
                StatisticsFunctions.numberOfPerson();
                menu();
                break;
            case 6:
                MainMenu.menu();
                break;
            case 8:
                MainMenu.menu();
                break;
            default:
                System.out.println("Invalid choice: (" + choice + ") try again!");
                menu();
                break;
        }
    }
}