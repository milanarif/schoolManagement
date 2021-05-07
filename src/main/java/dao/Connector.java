package dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Connector {
    private static EntityManagerFactory emf;

    public static void createEmf() {
        emf = Persistence.createEntityManagerFactory("school");
    }

    public static EntityManagerFactory getEmf() {
        return emf;
    }

    public static void closeEmf() {
        emf.close();
    }
}