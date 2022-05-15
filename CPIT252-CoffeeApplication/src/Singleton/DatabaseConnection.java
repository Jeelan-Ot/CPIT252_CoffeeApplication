package Singleton;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static Connection con = null;

    static {

        String url = "CoffeeShopDB.accdb";
        String DBurl = "jdbc:ucanaccess://" + url;

        try {
            con = DriverManager.getConnection(DBurl);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public static Connection getConnection() {

        return con;
    }
}
