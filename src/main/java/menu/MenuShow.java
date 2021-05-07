package menu;

import mainAndInput.Main;
import mainAndInput.Input;

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
        Integer choice = Input.inputInt();
        switch (choice) {
            case 1:

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
