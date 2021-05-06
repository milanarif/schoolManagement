package mainAndInput;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static boolean alive = true;
    public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("library");

    public static void main(String[] args) {

        while(alive){
            System.out.println("--School Management--");
            menu.mainMenu.mainMenu();
        }
    }
}
