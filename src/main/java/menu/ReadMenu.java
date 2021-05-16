package menu;

import backend.StudentFunctions;
import entity.Student;
import frontend.ReadFunctions;
import main.Main;
import main.Input;

public class ReadMenu {

    public static void menu() {

        System.out.println("\nREAD MENU");
        System.out.println("---------------");
        System.out.println("1. Show All Tables");
        System.out.println("2. Show All Courses");
        System.out.println("3. Show All Students");
        System.out.println("4. Show All Teachers");
        System.out.println("5. Show All Departments");

        System.out.println("\n6. Return");
        System.out.println("8. Main Menu");
        System.out.println("0. Exit");
        System.out.println("---------------");

        System.out.print("choice: ");
        Integer choice = Input.inputInt();
        switch (choice) {
            case 1:
                ReadFunctions.readAll();
                menu();
                break;
            case 2:
                ReadFunctions.readCourse();
                menu();
                break;
            case 3:
                ReadFunctions.readStudent();
                menu();
                break;
            case 4:
                ReadFunctions.readTeacher();
                menu();
                break;
            case 5:
                ReadFunctions.readDepartment();
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