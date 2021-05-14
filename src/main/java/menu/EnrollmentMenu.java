package menu;

import frontend.AddEnrollmentFunctions;
import main.Input;
import main.Main;

public class EnrollmentMenu {

    public static void menu(){

        System.out.println("\nENROLLMENT MENU");
        System.out.println("---------------");
        System.out.println("1. Add Student to Course");
        System.out.println("2. Add Teacher to Course");
        System.out.println("3. Add Student to Department");
        System.out.println("4. Add Teacher to Department");
        System.out.println("5. Add Grade to Enrollment");
        System.out.println("6. Remove Enrollment");

        System.out.println("\n7. Return");
        System.out.println("8. Main Menu");
        System.out.println("0. Exit");
        System.out.println("---------------");

        System.out.print("choice: ");
        Integer choice = Input.inputInt();
        switch(choice){
            case 1:
                AddEnrollmentFunctions.setCourseStudent();
                menu();
                break;
            case 2:
                AddEnrollmentFunctions.setCourseTeacher();
                menu();
                break;
            case 3:
                AddEnrollmentFunctions.setDepartmentStudent();
                menu();
                break;
            case 4:
                AddEnrollmentFunctions.setDepartmentTeacher();
                menu();
                break;
            case 5:
                AddEnrollmentFunctions.setGrade();
                break;
            case 6:
                RemoveEnrollmentMenu.menu();
                break;
            case 7:
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