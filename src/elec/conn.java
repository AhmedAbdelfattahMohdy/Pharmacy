/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author m
 */
public class conn {

        PreparedStatement k;
        Statement s;
        Connection con;
    public conn() {
        
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String URL="jdbc:sqlserver://localhost:1433;databaseName=elec;user=admin;password=12345678";
            con=DriverManager.getConnection(URL);
            s =con.createStatement();
            
            
        } catch (Exception ex) {
            Logger.getLogger(conn.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
                        
    
}
