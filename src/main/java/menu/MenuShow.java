package menu;

import java.util.List;

import backend.StudentFunctions;
import dao.StudentDao;
import dao.StudentDaoImpl;
import entity.Student;
import mainAndInput.Main;
import mainAndInput.input;

public class MenuShow {

    public static void menu(){

        System.out.println("---------------");
        System.out.println("1. Show all tables");
        System.out.println("2. Search");
        System.out.println("3. Statistics");

        System.out.println("\n6. Return");
        System.out.println("0. Exit");
        System.out.println("---------------");

        System.out.print("choice: ");
        Integer choice = input.inputInt();

        StudentFunctions sf = new StudentFunctions();
        Student students = new Student();
        StudentDaoImpl sd = new StudentDaoImpl();

        switch (choice) {
            case 1:
                sf.getAllStudents(students);
                break;
            case 2:
                MenuSearch.menu();
                break;
            case 3:
                MenuStatistics.menu();
                break;
            case 6:
                return;
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
