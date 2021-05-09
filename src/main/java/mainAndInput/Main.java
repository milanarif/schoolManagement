package mainAndInput;

import dao.Connector;
import menu.MenuMain;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static boolean alive = true;

    public static void main(String[] args) {

        Connector.createEmf();
        System.out.println("\nSchool Management");
        while(alive){
            MenuMain.menu();
        }

        Connector.closeEmf();
    }
}
