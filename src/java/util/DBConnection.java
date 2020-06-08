/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Umut
 */
public class DBConnection {
     public  Connection connect() {
        Connection c = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/tursirket?user=root&password=123");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            //System.out.println(ex.getMessage());
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }
}
