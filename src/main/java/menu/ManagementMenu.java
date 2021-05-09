package menu;

import main.Input;
import main.Main;

public class ManagementMenu {

    public static void menu(){

        System.out.println("\nMANAGEMENT MENU");
        System.out.println("---------------");
        System.out.println("1. Show Tables");
        System.out.println("2. Search");
        System.out.println("3. Create");
        System.out.println("4. Update");
        System.out.println("5. Delete");

        System.out.println("\n6. Return");
        System.out.println("8. Main Menu");
        System.out.println("0. Exit");
        System.out.println("---------------");


        System.out.print("choice: ");
        Integer choice = Input.inputInt();
        switch(choice){
            case 1:
                //TODO call print methods
                break;
            case 2:
                SearchMenu.menu();
                break;
            case 3:
                CreateMenu.menu();
                break;
            case 4:
                UpdateMenu.menu();
                break;
            case 5:
                DeleteMenu.menu();
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