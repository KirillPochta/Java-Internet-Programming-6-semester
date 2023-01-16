import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    public static Connection connection;

    public void connectToDB() throws SQLException, ClassNotFoundException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        String URL = "jdbc:sqlserver://KIRILLPC\\MSSQLSERVER:1433;DatabaseName=java_ee_lab;encrypt=false";
        connection = DriverManager.getConnection(URL, "JavaUser", "12");
        if (connection != null) {
            System.out.println("Connect to db has been performed successfully");
        }
        else {
            System.out.println("dont Connect to db");
        }
    }
}
