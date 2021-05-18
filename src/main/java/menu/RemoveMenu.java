package menu;

import frontend.RemoveFunctions;
import main.Input;
import main.Main;

public class RemoveMenu {

    public static void menu(){

        System.out.println("\n---------------");
        System.out.println("REMOVE MENU");

        System.out.println("1. Remove Course");
        System.out.println("2. Remove Student");
        System.out.println("3. Remove Teacher");
        System.out.println("4. Remove Department");

        System.out.println("\n6. Return");
        System.out.println("8. Main Menu");
        System.out.println("---------------");

        System.out.print("choice: ");
        Integer choice = Input.inputInt();
        switch(choice){
            case 1:
                RemoveFunctions.removeCourse();
                menu();
                break;
            case 2:
                RemoveFunctions.removeStudent();
                menu();
                break;
            case 3:
                RemoveFunctions.removeTeacher();
                menu();
                break;
            case 4:
                RemoveFunctions.removeDepartment();
                menu();
                break;
            case 6:
                MainMenu.menu();
                break;
            case 8:
                MainMenu.menu();
                break;
            default:
                System.out.println("Invalid choice: (" + choice + ") try again!");
                menu();
                break;
        }
    }
}