package main;

import dao.Connector;
import menu.MainMenu;

public class Main {

    public static boolean alive = true;

    public static void main(String[] args) {
        System.out.println(SocialSecurityChecker.socialSecurityValidator("199507095983"));

        Connector.createEmf();
        System.out.println("\nSCHOOL MANAGEMENT APPLICATION");
        while(alive){
            MainMenu.menu();
        }
        Connector.closeEmf();
    }
}
