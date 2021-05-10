package menu;

import main.Main;
import main.Input;

public class MainMenu {

    public static void menu() {

        System.out.println("\nMAIN MENU");
        System.out.println("---------------");
        System.out.println("1. Enrollment");
        System.out.println("2. Add");
        System.out.println("3. Read");
        System.out.println("4. Update");
        System.out.println("5. Delete");
        System.out.println("6. Search");
        System.out.println("7. Statistics");

        System.out.println("\n8. Help");
        System.out.println("0. Exit");
        System.out.println("---------------");

        System.out.print("choice: ");
        Integer choice = Input.inputInt();
        switch(choice){
            case 1:
                EnrollmentMenu.menu();
                break;
            case 2:
                AddMenu.menu();
                break;
            case 3:
                ReadMenu.menu();
                break;
            case 4:
                UpdateMenu.menu();
                break;
            case 5:
                DeleteMenu.menu();
                break;
            case 6:
                SearchMenu.menu();
                break;
            case 7:
                StatisticsMenu.menu();
                break;
            case 8:
                Help.help();
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
