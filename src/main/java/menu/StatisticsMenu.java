package menu;

import mainAndInput.Main;
import mainAndInput.Input;

public class MenuDepartment {

    public static void menu() {

        System.out.println("---------------");
        System.out.println("\n1. Department Add");
        System.out.println("2. Department Update");
        System.out.println("3. Department Delete ");
        System.out.println("4. Department Show ");

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
