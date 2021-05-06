package menu;

import mainAndInput.Main;
import mainAndInput.input;

public class teacherMenu {

    public static void teacherMenu() {

        System.out.println("1. Add Teacher");
        System.out.println("2. Update Teacher");
        System.out.println("3. Delete Teacher");
        System.out.println("6. Return");
        System.out.println("0. Exit");

        System.out.print("choice: ");
        Integer choice = input.inputInt();
        switch (choice) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 6:
                return;
            case 0:
                Main.alive = false;
                break;
            default:
                System.out.println("Invalid choice: (" + choice + ") try again!");
                teacherMenu();
                break;
        }
    }
}
