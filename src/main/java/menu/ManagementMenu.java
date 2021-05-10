package menu;

import main.Input;
import main.Main;

public class ManagementMenu {

    public static void menu(){

        System.out.println("\nMANAGEMENT MENU");
        System.out.println("---------------");
        System.out.println("1. Add Student to Course");
        System.out.println("2. Add Teacher to Course");
        System.out.println("3. Add Student to Department");
        System.out.println("4. Add Teacher to Department");

        System.out.println("\n6. Return");
        System.out.println("8. Main Menu");
        System.out.println("0. Exit");
        System.out.println("---------------");

        //TODO create new instance for calls

        System.out.print("choice: ");
        Integer choice = Input.inputInt();
        switch(choice){
            case 1:
                //TODO call studentToCourse
                break;
            case 2:
                //TODO call teacherToCourse
                break;
            case 3:
                //TODO call studentToDepartment
                break;
            case 4:
                //TODO call teacherToDepartment
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