package menu;

import backend.StudentFunctions;
import entity.Student;
import frontend.CreateFunctions;
import main.Main;
import main.Input;

public class CreateMenu {

    public static void menu(){

        System.out.println("\nCREATE MENU");
        System.out.println("---------------");
        System.out.println("1. Create Course");
        System.out.println("2. Create Student");
        System.out.println("3. Create Teacher");
        System.out.println("4. Create Department");

        System.out.println("\n6. Return");
        System.out.println("8. Main Menu");
        System.out.println("0. Exit");
        System.out.println("---------------");

        System.out.print("choice: ");
        Integer choice = Input.inputInt();
        switch(choice){
            case 1:
                //TODO call courseCreate
                break;
            case 2:
                CreateFunctions.addStudent();
                break;
            case 3:
                //TODO call teacherCreate
                break;
            case 4:
                //TODO call departmentCreate
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