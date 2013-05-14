/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Objecten.Collectiepunt;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Daniel
 */
public class CollectiepuntDb {
    
    public static Collectiepunt getById(int id) {
        Collectiepunt c = new Collectiepunt();
        try {
            PreparedStatement p = Database.getInstance().getPreparedStatement("SELECT * FROM collectiepunt WHERE id = ?");
            p.setInt(1,id);
            ResultSet rs = p.executeQuery();
            rs.first();
            CollectiepuntDb.VulCollectiepunt(c, rs);
        } catch (SQLException e) {}
        return c;
    }
    
    public static int createCollectiepunt(Collectiepunt c) {
        try {
            PreparedStatement p = Database.getInstance().getPreparedStatement(""
                    + "INSERT INTO `collectiepunt` (`naam`, `actief`, `verantwoordelijke`, `latitude`, `longitude`) "
                    + "VALUES (?, ?, ?, ?, ?);");
            p.setString(1, c.getNaam());
            p.setInt(2, c.getActief());
            p.setInt(3, c.getVerantwoordelijke());
            p.setDouble(4, c.getLatitude());
            p.setDouble(5,c.getLongitude());
            
            int r = p.executeUpdate();
            if(r > 0) {
                ResultSet rs = p.getGeneratedKeys();
                rs.first();
                c.setId(rs.getInt(1));
                return c.getId();
            }
        }catch (SQLException e) {}
        return 0;
    }
    
    public static boolean updateCollectiepunt(Collectiepunt c) {
        try {
            PreparedStatement p = Database.getInstance().getPreparedStatement("UPDATE collectiepunt SET"
                    + "naam = ?,"
                    + "actief = ?,"
                    + "verantwoordelijke = ?,"
                    + "latitude = ?,"
                    + "longitude = ?"
                    + "WHERE id = ?");
            p.setString(1, c.getNaam());
            p.setInt(2,c.getActief());
            p.setInt(3, c.getVerantwoordelijke());
            p.setDouble(4,c.getLatitude());
            p.setDouble(5,c.getLongitude());
            p.setInt(6, c.getId());
        } catch (SQLException e) {}
        return false;
    }
    
    public static void VulCollectiepunt(Collectiepunt c, ResultSet rs) throws SQLException {
        c.setActief(rs.getInt("actief"));
        c.setAdresid(rs.getInt("adresid"));
        c.setId(rs.getInt("id"));
        c.setNaam(rs.getString("naam"));
        c.setVerantwoordelijke(rs.getInt("verantwoordelijke"));
        c.setLatitude(rs.getDouble("latitude"));
        c.setLongitude(rs.getDouble("longitude"));
    }
}
