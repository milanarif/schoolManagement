package menu;

import frontend.StatisticsFunctions;
import main.Main;
import main.Input;

public class StatisticsMenu {

    public static void menu() {

        System.out.println("\nSTATISTICS MENU");
        System.out.println("---------------");
        System.out.println("1. Pass Ratio Course");
        System.out.println("2. Pass Ratio Student");
        System.out.println("3. Gender Ratio Course");
        System.out.println("4. Gender Ratio Department");
        System.out.println("5. Amount of Persons in School");

        System.out.println("\n6. Return");
        System.out.println("8. Main Menu");
        System.out.println("---------------");

        System.out.print("choice: ");
        Integer choice = Input.inputInt();
        switch (choice) {
            case 1:
                StatisticsFunctions.passRatioCourse();
                menu();
                break;
            case 2:
                StatisticsFunctions.passRatioStudent();
                menu();
                break;
            case 3:
                StatisticsFunctions.genderRatioCourse();
                menu();
                break;
            case 4:
                StatisticsFunctions.genderRatioDepartment();
                menu();
                break;
            case 5:
                StatisticsFunctions.numberOfPerson();
                menu();
                break;
            case 6:
                MainMenu.menu();
                break;
            case 8:
                MainMenu.menu();
                break;
            default:
                System.out.println("Invalid choice: (" + choice + ") try again!");
                menu();
                break;
        }
    }

}