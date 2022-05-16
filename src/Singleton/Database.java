package Singleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

    private static Connection connection = DatabaseConnection.getConnection();

    public boolean register(String fName, String email, String password) {
        boolean isRegistered = false;
        if (!isUserExist(email)) {
            try {
                String insert = "INSERT INTO User (Fname, Email, Password) VALUES(?, ? , ?)";
                PreparedStatement preparedStmt = connection.prepareStatement(insert);

                preparedStmt.setString(1, fName);
                preparedStmt.setString(2, email);
                preparedStmt.setString(3, password);
                preparedStmt.execute();
                isRegistered = true;
            } catch (SQLException ex) {
            }
        } else {
            isRegistered = false;
        }
        return isRegistered;
    }

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
