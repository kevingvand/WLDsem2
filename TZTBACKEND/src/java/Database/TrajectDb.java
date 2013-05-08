/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Objecten.Traject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Daniel
 */
public class TrajectDb {
    /**
     * Get Traject by id
     * @param id int
     * @return 
     */
    public static Traject getTrajectById(int id) {
        
        try {
            Traject t = new Traject();
            Connection c = TrajectDb.getConnection();
            PreparedStatement p = c.prepareStatement("SELECT * FROM Trajecten WHERE id = ? LIMIT 1");
            p.setInt(1, id);
            ResultSet rs = p.executeQuery();
            
            rs.first();            
            TrajectDb.VulTraject(t, rs);
            return t;
        } catch(Exception ex) {}
        
        return null;        
    }
    
    /**
     * Fill a traject object with the current row
     * @param t Traject
     * @param s ResultSet
     * @throws SQLException 
     */
    protected static void VulTraject(Traject t, ResultSet s) throws SQLException {
        t.setId(s.getInt("id"));
        t.setAfstand(s.getDouble("afstand"));
        t.setDatetime(s.getDate("datetime"));
        t.setKoerierid(s.getInt("koerierid"));
    }
    
    /**
     * Get database connection
     * @return
     * @throws SQLException 
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://159.253.7.224:3306/kevined104_tzt", "kevined104_tzt", "tzters");
    }
}
