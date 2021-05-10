package menu;

import main.Input;
import main.Main;

public class DeleteMenu {

    public static void menu(){

        System.out.println("\n---------------");
        System.out.println("DELETE MENU");

        System.out.println("1. Delete Course");
        System.out.println("2. Delete Student");
        System.out.println("3. Delete Teacher");
        System.out.println("4. Delete Department");

        System.out.println("\n6. Return");
        System.out.println("8. Main Menu");
        System.out.println("0. Exit");
        System.out.println("---------------");

        //TODO create new instance for calls

        System.out.print("choice: ");
        Integer choice = Input.inputInt();
        switch(choice){
            case 1:
                //TODO call deleteCourse
                break;
            case 2:
                //TODO call deleteStudent
                break;
            case 3:
                //TODO call deleteTeacher
                break;
            case 4:
                //TODO call deleteDepartment
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