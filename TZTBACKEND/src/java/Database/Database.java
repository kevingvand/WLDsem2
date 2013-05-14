/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Daniel
 */
public class Database {
    
    private static Database db = null;
    private Connection  c = null;
    
    private Database() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        this.c = DriverManager.getConnection("jdbc:mysql://159.253.7.224:3306/kevined104_tzt", "kevined104_tzt", "tzters");
    }
    
    public Connection getConnection() {
        return this.c;
    }
    
    public PreparedStatement getPreparedStatement(String sql) throws SQLException {
        return this.c.prepareStatement(sql);
    }
    
    public static Database getInstance() {
        if(Database.db == null) {
            try {
                Database.db = new Database();
            } catch(Exception e) {
                
            }
        }
        return Database.db;
    }
}
