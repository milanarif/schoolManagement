package menu;

import mainAndInput.Main;
import mainAndInput.Input;

public class MenuSearch {

    public static void menu() {

        System.out.println("---------------");
        System.out.println("1. Search Courses");
        System.out.println("2. Search Students");
        System.out.println("3. Search Teachers");
        System.out.println("4. Search Department");
        System.out.println("5. Search Enrollment");

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
            case 5:

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
