package Singleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Database {

    public static int countRows = 0;
    private static Connection connection = DatabaseConnection.getConnection();

    public Database() {
    }

    public String getDBpath(){
    
        String url = "CoffeeShopDB.accdb";
        String DBurl = "jdbc:ucanaccess://" + url;
        
        return DBurl;
    }
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

    public boolean isUserExist(String email) {
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

    public boolean isPasswordValid(String email, String password) {
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

    public void insertOrder(String email, String[] order, int cost, String date) {
        try {
            String insert = "INSERT INTO Order (CustEmail, CoffeeType, Size, Additives, Cost, OrderDate, Status) VALUES(?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStmt = connection.prepareStatement(insert);

            preparedStmt.setString(1, email);
            preparedStmt.setString(2, order[0]);
            preparedStmt.setString(3, order[1]);
            String addtivies = "";
            for (int i = 2; i < order.length; i++) {
                addtivies += order[i] + ",";
            }
            preparedStmt.setString(4, addtivies);
            preparedStmt.setInt(5, cost);
            preparedStmt.setString(6, date);
            preparedStmt.setString(7, "Pending");
            countRows++;
            preparedStmt.execute();
            
        } catch (SQLException ex) {
        }
    }

    public String[][] getOrder(String email) {
       int row = 0;
        String[][] orderDetail = new String[countRows][4];
        try {
            Statement st = connection.createStatement();
            String selectStatment = "SELECT CustEmail, CoffeeType, Size, Additives, Cost, OrderDate FROM Order WHERE CustEmail = '" + email + "' AND Status = 'Pending'";
            ResultSet rs = st.executeQuery(selectStatment);

            while (rs.next()) {
                orderDetail[row][0] = rs.getString("CoffeeType");
                orderDetail[row][1] = rs.getString("Size");
                orderDetail[row][2] = rs.getString("Additives");
                orderDetail[row][3] = rs.getInt("Cost")+"";
                row++;
            }
            Statement st2 = connection.createStatement();
            String update = "UPDATE order SET status ='Done' WHERE status = 'Pending'";
            st2.executeUpdate(update);
            
            countRows = 0;
        } catch (SQLException ex) {
        }
        return orderDetail;
    }

    
    
}
