import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DatabasePanel extends JPanel {
    
    JTextField sqlInput = new JTextField(); // for input sql statments

    JButton executeBTN = new JButton("execute");

    JTable table = new JTable(); // for display a results
    DefaultTableModel model = (DefaultTableModel) table.getModel();

    Connector conn;

    public DatabasePanel(Connector conn) {
        this.conn = conn;

        setLayout(new GridLayout(3,1));
        
        add(sqlInput);

        executeBTN.addActionListener(this::execute);

        add(executeBTN);

        JScrollPane tableScrollPane = new JScrollPane(table);

        add(tableScrollPane);
    }

    private void resetTable() {
        model.setColumnCount(0);
        model.setRowCount(0);
    }


    private void execute(ActionEvent e) {
        resetTable();

        String query = sqlInput.getText();

        try {
            ResultSet resultSet = conn.executeQuery(query);

            ResultSetMetaData data = resultSet.getMetaData();

            for (int i = 1; i <= data.getColumnCount(); i++) {
                model.addColumn(data.getColumnName(i));
            }

            while(resultSet.next()) {
                String[] gottenData = new String[data.getColumnCount()];
                for (int i = 0; i < data.getColumnCount(); i++) {
                    gottenData[i] = resultSet.getString(i+1);
                }

                model.addRow(gottenData);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
