package menu;

import main.Main;
import main.Input;

public class StatisticsMenu {

    public static void menu() {

        System.out.println("\nSTATISTICS MENU");
        System.out.println("---------------");
        System.out.println("1. Pass ratio");
        System.out.println("2. Gender Ratio");
        System.out.println("3. Average Age");
        System.out.println("4. Number of Students");
        System.out.println("5. Number of Teachers");

        System.out.println("\n6. Return");
        System.out.println("8. Main Menu");
        System.out.println("0. Exit");
        System.out.println("---------------");

        //TODO create new instance for calls

        System.out.print("choice: ");
        Integer choice = Input.inputInt();
        switch (choice) {
            case 1:
                //TODO call passRatio
                break;
            case 2:
                //TODO call genderRatio
                break;
            case 3:
                //TODO call averageAge
                break;
            case 4:
                //TODO call numberOfStudents
                break;
            case 5:
                //TODO call numberOfTeachers
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