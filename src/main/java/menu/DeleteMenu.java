package menu;

import frontend.DeleteFunctions;
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
                DeleteFunctions.deleteCourse();
                menu();
                break;
            case 2:
                DeleteFunctions.deleteStudent();
                menu();
                break;
            case 3:
                DeleteFunctions.deleteTeacher();
                menu();
                break;
            case 4:
                DeleteFunctions.deleteDepartment();
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