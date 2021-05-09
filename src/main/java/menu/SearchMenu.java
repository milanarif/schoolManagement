package menu;

import main.Main;
import main.Input;

public class SearchMenu {

    public static void menu() {

        System.out.println("\nSEARCH MENU");
        System.out.println("---------------");
        System.out.println("1. Search Courses");
        System.out.println("2. Search Students");
        System.out.println("3. Search Teachers");
        System.out.println("4. Search Department");

        System.out.println("\n6. Return");
        System.out.println("8. Main Menu");
        System.out.println("0. Exit");
        System.out.println("---------------");

        //TODO create new instance for calls

        System.out.print("choice: ");
        Integer choice = Input.inputInt();
        switch (choice) {
            case 1:
                //TODO call searchCourse
                break;
            case 2:
                //TODO call searchStudent
                break;
            case 3:
                //TODO call searchTeacher
                break;
            case 4:
                //TODO call searchDepartment
                break;
            case 6:
                return;
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