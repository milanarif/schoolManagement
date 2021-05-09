package menu;

import backend.StudentFunctions;
import dao.StudentDaoImpl;
import entity.Student;
import mainAndInput.Main;
import mainAndInput.input;

public class MenuStudent {

    public static void menu() {

        System.out.println("---------------");
        System.out.println("1. Student Add");
        System.out.println("2. Student Update");
        System.out.println("3. Student Delete");
        System.out.println("4. Student Show");
        System.out.println("5. Change Grade???");

        System.out.println("\n6. Return");
        System.out.println("0. Exit");
        System.out.println("---------------");

        Student student = new Student();
        StudentFunctions sf = new StudentFunctions();

        System.out.print("choice: ");
        Integer choice = input.inputInt();
        switch (choice) {
            case 1:
                sf.addStudent(student);
                break;
            case 2:

                break;
            case 3:
               // studentDaoImpl.deleteStudent(student);

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:
                return;
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
