import javax.swing.*;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {

        JFrame main = new JFrame("GrannDB Client");

        Properties databaseProperties = new Properties();

        ConnetorDialog inputDBInfo = new ConnetorDialog(main, "Database Info", databaseProperties);
        inputDBInfo.setVisible(true);

        main.setSize(800,600);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // When close the window close the application
        main.setVisible(true);
    }
}
