package menu;

import frontend.RemoveEnrollmentFunctions;
import main.Input;
import main.Main;

public class RemoveEnrollmentMenu {

    public static void menu(){

        System.out.println("\nREMOVE ENROLLMENT MENU");
        System.out.println("---------------");
        System.out.println("1. Remove Student from Course");
        System.out.println("2. Remove Teacher from Course");
        System.out.println("3. Remove Student from Department");
        System.out.println("4. Remove Teacher from Department");

        System.out.println("\n6. Return");
        System.out.println("8. Main Menu");
        System.out.println("0. Exit");
        System.out.println("---------------");

        System.out.print("choice: ");
        Integer choice = Input.inputInt();
        switch(choice){
            case 1:
                RemoveEnrollmentFunctions.removeCourseStudent();
                menu();
                break;
            case 2:
                RemoveEnrollmentFunctions.removeCourseTeacher();
                menu();
                break;
            case 3:
                RemoveEnrollmentFunctions.removeDepartmentStudent();
                menu();
                break;
            case 4:
                RemoveEnrollmentFunctions.removeDepartmentTeacher();
                menu();
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
