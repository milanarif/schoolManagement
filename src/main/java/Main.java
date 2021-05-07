import dao.Connector;

public class Main {
    public static void main(String[] args) {
        Connector.createEmf();
        Connector.closeEmf();
    }
}
