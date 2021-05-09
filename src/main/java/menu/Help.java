package menu;

public class Help {

    public static void help(){
        System.out.println("\nWelcome to the School CRUD application.");

        System.out.println("\nChoose from the options presented to you in the menus.");
        System.out.println("Use the numbers on your keyboard matching the options to move through this application.");

        System.out.print("\nPress ENTER to continue...");
        String enter = main.Input.inputString();

        MainMenu.menu();
    }
}




