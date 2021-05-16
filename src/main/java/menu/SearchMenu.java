package menu;

import frontend.SearchFunctions;
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

        System.out.print("choice: ");
        Integer choice = Input.inputInt();
        switch (choice) {
            case 1:
                SearchFunctions.searchCourse();
                menu();
                break;
            case 2:
                SearchFunctions.searchStudent();
                menu();
                break;
            case 3:
                SearchFunctions.searchTeacher();
                menu();
                break;
            case 4:
                SearchFunctions.searchDepartment();
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