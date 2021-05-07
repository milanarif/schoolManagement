package menu;

import mainAndInput.Main;
import mainAndInput.input;

public class mainMenu {

    public static void menu() {

        System.out.println("---------------");
        System.out.println("1. Show");
        System.out.println("2. Management");
        System.out.println("3. Courses");
        System.out.println("4. Students");
        System.out.println("5. Teachers");
        System.out.println("6. Departments");
        System.out.println("7. Enrollments");

        System.out.println("\n0. Exit");
        System.out.println("---------------");

        System.out.print("choice: ");
        Integer choice = input.inputInt();
        switch(choice){
            case 1:
                showMenu.menu();
                break;
            case 2:
                managementMenu.menu();
                break;
            case 3:
                courseMenu.menu();
                break;
            case 4:
                studentMenu.menu();
                break;
            case 5:
                teacherMenu.menu();
                break;
            case 6:
                departmentMenu.menu();
                break;
            case 7:
                enrollmentMenu.menu();
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
