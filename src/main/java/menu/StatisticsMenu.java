package menu;

import main.Main;
import main.Input;

public class StatisticsMenu {

    public static void menu() {

        System.out.println("\nSTATISTICS MENU");
        System.out.println("---------------");
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("3. ");

        System.out.println("\n6. Return");
        System.out.println("8. Main Menu");
        System.out.println("0. Exit");
        System.out.println("---------------");

        //TODO create new instance for calls

        System.out.print("choice: ");
        Integer choice = Input.inputInt();
        switch (choice) {
            case 1:
                //TODO update menu, switch cases and add calls
                break;
            case 2:

                break;
            case 3:

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