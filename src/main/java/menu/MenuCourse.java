package menu;

import mainAndInput.Main;
import mainAndInput.Input;

public class MenuCourse {

    public static void menu(){

        System.out.println("---------------");
        System.out.println("1. Course Add");
        System.out.println("2. Course Update");
        System.out.println("3. Course Delete");
        System.out.println("4. Course Show");

        System.out.println("\n6. Return");
        System.out.println("0. Exit");
        System.out.println("---------------");

        System.out.print("choice: ");
        Integer choice = Input.inputInt();
        switch(choice){
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
