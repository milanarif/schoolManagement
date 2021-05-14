package menu;

import frontend.UpdateFunctions;
import main.Main;
import main.Input;

public class UpdateMenu {

    public static void menu() {

        System.out.println("\nUPDATE MENU");
        System.out.println("---------------");
        System.out.println("1. Update Course");
        System.out.println("2. Update Student");
        System.out.println("3. Update Teacher");
        System.out.println("4. Update Department");
        System.out.println("5. Update Enrollment");

        System.out.println("\n6. Return");
        System.out.println("8. Main Menu");
        System.out.println("0. Exit");
        System.out.println("---------------");

        System.out.print("choice: ");
        Integer choice = Input.inputInt();
        switch (choice) {
            case 1:
                UpdateFunctions.updateCourse();
                menu();
                break;
            case 2:
                UpdateFunctions.updateStudent();
                menu();
                break;
            case 3:
                UpdateFunctions.updateTeacher();
                menu();
                break;
            case 4:
                UpdateFunctions.updateDepartment();
                menu();
                break;
            case 5:
                UpdateFunctions.updateGrade();
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