import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

public class ConnetorDialog extends JDialog implements ActionListener {

    public ConnetorDialog(JFrame owner, String title, Properties p) {
        super(owner,title,true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
