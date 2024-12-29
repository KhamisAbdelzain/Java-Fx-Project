/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ME
 */
public class DatabaseConnection {
    private static final String DRIVER="com.mysql.jdbc.Driver";
    private static final String USERNAME="root";
    private static final String PASSWORD="1234";
    private static final String URL="jdbc:mysql://localhost:3306/fxsystem";
    private static Connection connection;
    public static Connection connect() throws SQLException{
        try {
            Class.forName(DRIVER);
            connection=DriverManager.getConnection(URL,USERNAME,PASSWORD);
            JOptionPane.showMessageDialog(null, "Connect");
            return connection;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        } finally {
            connection.close();
        }
    
        return connection;
    }
    
    
}
