/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Objecten.Klacht;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Daniel
 */
public class KlachtDb {
    public static Klacht getById(int id) {
        Klacht k = new Klacht();
        try {
            PreparedStatement p = Database.getInstance().getPreparedStatement("SELECT * FROM klacht WHERE id = ?");
            p.setInt(1, id);
            ResultSet rs = p.executeQuery();
            rs.first();
            KlachtDb.vulKlacht(k, rs);
        } catch(SQLException e) {}
        return k;
    }
    
    public static int createKlacht(Klacht k) {
        try{
            PreparedStatement p = Database.getInstance().getPreparedStatement(""
                    + "INSERT INTO `klacht` (`pakketid`, `klacht`, `commentaar`) "
                    + "VALUES (?, ?, ?);");
            p.setInt(1, k.getPakketid());
            p.setString(2, k.getKlacht());
            p.setString(3, k.getCommentaar());
            int r = p.executeUpdate();
            if(r > 0) {
                ResultSet rs = p.getGeneratedKeys();
                rs.first();
                k.setId(rs.getInt(1));
                return k.getId();
            }
        } catch (SQLException e){}
        return 0;
    }
    
    public static boolean updateKlacht(Klacht k) {
        try {
            PreparedStatement p = Database.getInstance().getPreparedStatement("UPDATE klacht SET "
                    + "pakketid = ?,"
                    + "klacht = ?,"
                    + "commentaar = ?"
                    + " WHERE id = ?");
            p.setInt(1, k.getPakketid());
            p.setString(2, k.getKlacht());
            p.setString(3, k.getCommentaar());
            p.setInt(4, k.getId());
            
            int r = p.executeUpdate();
            if(r > 0) {
                return true;
            }
        } catch(SQLException e) {}
        return false;
    }
    
    public static void vulKlacht(Klacht k, ResultSet rs) throws SQLException {
        k.setCommentaar(rs.getString("commentaar"));
        k.setId(rs.getInt("id"));
        k.setKlacht(rs.getString("klacht"));
        k.setPakketid(rs.getInt("pakketid"));
    }
}
