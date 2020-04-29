import java.util.Properties;

public class Connector {

    private String db_url, db_name, db_user, db_pass, db_host, db_port, db_driver;

    public Connector(Properties props, String pass) {

        db_name = props.getProperty("db_name");
        db_user = props.getProperty("db_user", "root");
        db_pass = pass;
        db_host = props.getProperty("db_host");
        db_port = props.getProperty("db_port");
        db_driver = "com.cj.mysql.jdbc.driver";
        db_url = "jdbc:mysql://" + db_host + ":" + db_port + "/" + db_name;

        System.out.println(db_url);
    }
}
