package menu;

import backend.CourseFunctions;
import backend.DepartmentFunctions;
import backend.StudentFunctions;
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
        System.out.println("0. Exit");
        System.out.println("---------------");

        System.out.print("choice: ");
        Integer choice = Input.inputInt();
        Integer courseId;
        String socialSecurity;
        Integer departmentId;
        switch (choice) {
            case 1:
                System.out.println("Enter Course ID: ");
                courseId = Input.inputInt();
                StatisticsFunctions.passRatio(CourseFunctions.getCourse(courseId).getEnrollments());
                menu();
                break;
            case 2:
                System.out.println("Enter Student Social Security: ");
                socialSecurity = Input.inputString();
                StatisticsFunctions.passRatio(StudentFunctions.getStudent(socialSecurity).getEnrollments());
                menu();
                break;
            case 3:
                System.out.println("Enter Course ID: ");
                courseId = Input.inputInt();
                StatisticsFunctions.genderRatioCourse(CourseFunctions.getCourse(courseId).getEnrollments());
                menu();
                break;
            case 4:
                System.out.println("Enter Department ID: ");
                departmentId = Input.inputInt();
                StatisticsFunctions.genderRatioDepartment(DepartmentFunctions.getDepartment(departmentId).getStudents());
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
            case 0:
                Main.alive = false;
                break;
            default:
                System.out.println("Invalid choice: (" + choice + ") try again!");
                menu();
                break;
        }
    }
}