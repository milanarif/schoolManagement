package menu;

import frontend.AddEnrollmentFunctions;
import main.Input;
import main.Main;

public class EnrollmentMenu {

    public static void menu(){

        System.out.println("\nENROLLMENT MENU");
        System.out.println("---------------");
        System.out.println("1. Add Enrollments");
        System.out.println("2. Remove Enrollments");
        System.out.println("3. Set Grade");

        System.out.println("\n6. Return");
        System.out.println("8. Main Menu");
        System.out.println("0. Exit");
        System.out.println("---------------");

        System.out.print("choice: ");
        Integer choice = Input.inputInt();
        switch(choice){
            case 1:
                EnrollmentMenuAdd.menu();
                menu();
                break;
            case 2:
                EnrollmentMenuRemove.menu();
                menu();
                break;
            case 3:
                AddEnrollmentFunctions.setGrade();
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

