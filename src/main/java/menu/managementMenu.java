package menu;

import mainAndInput.Main;

public class managementMenu {

    public static void menu(){

        System.out.println("---------------");
        System.out.println("1. Add Student to Course");
        System.out.println("2. Add Teacher to Course");
        System.out.println("3. Remove Student from Course");
        System.out.println("4. Remove Teacher from Course");

        System.out.println("\n6. Return");
        System.out.println("0. Exit");
        System.out.println("---------------");

        System.out.print("choice: ");
        Integer choice = mainAndInput.input.inputInt();
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
