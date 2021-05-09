package menu;

import mainAndInput.Main;
import mainAndInput.Input;

public class MenuTeacher {

    public static void menu() {

        System.out.println("---------------");
        System.out.println("1. Teacher Add");
        System.out.println("2. Teacher Update");
        System.out.println("3. Teacher Delete");
        System.out.println("4. Teacher Show");

        System.out.println("\n6. Return");
        System.out.println("0. Exit");
        System.out.println("---------------");

        System.out.print("choice: ");
        Integer choice = Input.inputInt();
        switch (choice) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

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
