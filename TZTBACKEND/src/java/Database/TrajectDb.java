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
import java.util.ArrayList;

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
            PreparedStatement p = Database.getInstance().getPreparedStatement("SELECT * FROM traject WHERE id = ? LIMIT 1");
            p.setInt(1, id);
            ResultSet rs = p.executeQuery();
            
            rs.first();            
            TrajectDb.VulTraject(t, rs);
            return t;
        } catch(Exception ex) {}
        
        return null;        
    }
    
    public static ArrayList<Traject> getTrajectByKoerierId(int id) {
        ArrayList al = new ArrayList<Traject>();
        Traject t;
        try {
            PreparedStatement p = Database.getInstance().getPreparedStatement("SELECT * FROM traject WHERE koerierid = ?");
            p.setInt(1, id);
            ResultSet rs = p.executeQuery();
            while(rs.next()) {
                t = new Traject();
                TrajectDb.VulTraject(t, rs);
                al.add(t);
            }
            return al;
        } catch (Exception e) {}
        return null;
    }
    
    /**
     * Haal alle trajecten op met startlocatie x en eindlocatie y
     * @param start int
     * @param end int
     * @return 
     */
    public static ArrayList<Traject> getTrajectByStartAndEndLocationId(int start, int end) {
        ArrayList al = new ArrayList<Traject>();
        Traject t;
        try {
            PreparedStatement p = Database.getInstance().getPreparedStatement("SELECT * FROM traject WHERE beginlocatie = ? AND eindlocatie = ?");
            p.setInt(1, start);
            p.setInt(2, end);
            ResultSet rs = p.executeQuery();
            while(rs.next()) {
                t = new Traject();
                TrajectDb.VulTraject(t, rs);
                al.add(t);
            }
            return al;
        } catch (Exception e) {}
        return null;
    }
    
    /**
     * Haal alle Trajecten op die vanaf id locatie komen
     * @param id int
     * @return 
     */
    public static ArrayList<Traject> getTrajectByStartLocationId(int id) {
        ArrayList al = new ArrayList<Traject>();
        Traject t;
        try{
            PreparedStatement p = Database.getInstance().getPreparedStatement("SELECT * FROM traject WHERE beginlocatie = ?");
            p.setInt(1, id);
            ResultSet rs = p.executeQuery();
            while(rs.next()) {
                t = new Traject();
                TrajectDb.VulTraject(t, rs);
                al.add(t);
            }
            return al;
        } catch (Exception e){}
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
}
