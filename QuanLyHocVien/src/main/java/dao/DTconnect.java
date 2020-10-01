/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Conroy Dang
 */
public class DTconnect {

    public static Connection getConnection()  {
        try {
            Connection cons = null;
            Class.forName("com.mysql.jdbc.Driver");
            cons = DriverManager.getConnection("jdbc:mysql://localhost/project_1", "root", "Bestmatch@123");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) throws SQLException {
        Connection c=getConnection();
        
    }
}
