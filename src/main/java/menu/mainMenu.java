package menu;

import mainAndInput.Main;
import mainAndInput.input;

public class mainMenu {

    public static void mainMenu() {

        System.out.println("1. Courses");
        System.out.println("2. Students");
        System.out.println("3. Teachers");
        System.out.println("4. Department");
        System.out.println("5. Enrollment");
        System.out.println("0. Exit");

        System.out.print("choice: ");
        Integer choice = input.inputInt();
        switch(choice){
            case 1:
                courseMenu.courseMenu();
                break;
            case 2:
                studentMenu.studentMenu();
                break;
            case 3:
                teacherMenu.teacherMenu();
                break;
            case 4:
                departmentMenu.departmentMenu();
                break;
            case 5:
                enrollmentMenu.enrollmentMenu();
                break;
            case 0:
                Main.alive = false;
                break;
            default:
                System.out.println("Invalid choice: (" + choice + ") try again!");
                mainMenu();
                break;
        }
    }
}
