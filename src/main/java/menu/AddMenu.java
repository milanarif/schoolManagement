package menu;

import dao.TeacherDao;
import dao.TeacherDaoImpl;
import frontend.AddFunctions;
import main.Main;
import main.Input;

public class AddMenu {

    public static void menu(){

        System.out.println("\nADD MENU");
        System.out.println("---------------");
        System.out.println("1. Add Course");
        System.out.println("2. Add Student");
        System.out.println("3. Add Teacher");
        System.out.println("4. Add Department");

        System.out.println("\n6. Return");
        System.out.println("8. Main Menu");
        System.out.println("0. Exit");
        System.out.println("---------------");

        System.out.print("choice: ");
        Integer choice = Input.inputInt();
        switch(choice){
            case 1:
                AddFunctions.addCourse();
                break;
            case 2:
                AddFunctions.addStudent();
                break;
            case 3:
                AddFunctions.addTeacher();
                break;
            case 4:
                AddFunctions.addDepartment();
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