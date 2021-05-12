package menu;

import frontend.StatisticsFunctions;
import main.Main;
import main.Input;

public class StatisticsMenu {

    public static void menu() {

        System.out.println("\nSTATISTICS MENU");
        System.out.println("---------------");
        System.out.println("1. Pass ratio");
        System.out.println("2. Gender Ratio");
        System.out.println("3. Average Age");
        System.out.println("4. Amount of Persons in School");

        System.out.println("\n6. Return");
        System.out.println("8. Main Menu");
        System.out.println("0. Exit");
        System.out.println("---------------");

        System.out.print("choice: ");
        Integer choice = Input.inputInt();
        switch (choice) {
            case 1:
                StatisticsFunctions.passRatio();
                menu();
                break;
            case 2:
                StatisticsFunctions.genderRatio();
                menu();
                break;
            case 3:
                StatisticsFunctions.averageAge();
                menu();
                break;
            case 4:
                StatisticsFunctions.numberOfPerson();
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