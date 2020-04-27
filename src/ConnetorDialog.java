import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

public class ConnetorDialog extends JDialog implements ActionListener {

    Properties dbProperties;

    JLabel hostLBL = new JLabel("Host");
    JTextField host = new JTextField();

    JLabel portLBL = new JLabel("Port");
    JTextField port = new JTextField();

    JLabel dbNameLBL = new JLabel("DB Name");
    JTextField dbName = new JTextField();

    JLabel userLBL = new JLabel("User");
    JTextField user = new JTextField();

    JLabel passLBL = new JLabel("Pasword");
    JTextField pass = new JTextField();

    JButton submit = new JButton("submit");
    JButton cancel = new JButton("cancel");

    public ConnetorDialog(JFrame owner, String title, Properties props) {
        super(owner,title,false);

        setSize(400,400);

        dbProperties = props;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
