/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Objecten.Checkin;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Daniel
 */
public class CheckinDb {
    public static Checkin getById(int id) {
        Checkin c = new Checkin();
        try {
            PreparedStatement p = Database.getInstance().getPreparedStatement("SELECT * FROM checkin WHERE id = ?");
            p.setInt(1, id);
            ResultSet rs = p.executeQuery();
            rs.first();
            CheckinDb.vulCheckin(c, rs);
        } catch (SQLException e) {}
        return c;
    }
    
    public static int createCheckin(Checkin c) {
        try {
            PreparedStatement p = Database.getInstance().getPreparedStatement(""
                    + "INSERT INTO `checkin` ( `type`, `status`, `pakketid`, `commentaar`, `datetime`, `collectiepuntid`, `gebruikerid`) "
                    + "VALUES ( ?, ?, ?, ?, NOW(), ?, ?);");
            p.setInt(1, c.getType());
            p.setInt(2, c.getStatus());
            p.setInt(3, c.getPakketid());
            p.setString(4, c.getCommentaar());
            p.setInt(5, c.getCollectiepuntid());
            p.setInt(6, c.getGebruikerid());
            int r = p.executeUpdate();
            if(r > 0) {
                ResultSet rs = p.getGeneratedKeys();
                rs.first();
                c.setId(rs.getInt(1));
                return c.getId();
            }
        } catch (SQLException e) {}
        return 0;
    }   
    
    public static void vulCheckin(Checkin c, ResultSet rs) throws SQLException {
        c.setCollectiepuntid(rs.getInt("collectiepuntid"));
        c.setCommentaar(rs.getString("commentaar"));
        c.setDatetime(rs.getDate("datetime"));
        c.setGebruikerid(rs.getInt("gebruikerid"));
        c.setId(rs.getInt("id"));
        c.setPakketid(rs.getInt("pakketid"));
        c.setStatus(rs.getInt("status"));
        c.setType(rs.getInt("type"));
    }
}
