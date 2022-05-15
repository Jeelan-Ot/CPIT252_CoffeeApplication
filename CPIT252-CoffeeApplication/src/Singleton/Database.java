package Singleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

    private static Connection connection = DatabaseConnection.getConnection();

    public static boolean isUserExist(String email) {
        boolean isUser = false;
        try {
            Statement st = connection.createStatement();
            String selectStatment = "SELECT Email FROM User WHERE Email = '" + email + "'";
            ResultSet rs = st.executeQuery(selectStatment);
            if (rs.next()) {
                isUser = true;
            }
        } catch (SQLException ex) {
        }
        return isUser;
    }

    public static boolean isPasswordValid(String email, String password) {
        boolean passwordValidity = false;
        try {
            Statement st = connection.createStatement();
            String selectStatment = "SELECT Email, Password FROM User WHERE Email = '" + email + "' AND Password = '" + password + "'";
            ResultSet rs = st.executeQuery(selectStatment);
            if (rs.next()) {
                passwordValidity = true;
            }
        } catch (SQLException ex) {
        }
        return passwordValidity;
    }

}
