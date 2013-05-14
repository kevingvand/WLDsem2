/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Objecten.Adres;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Daniel
 */
public class AdresDb {
    
    public static Adres getById(int id) {
        Adres a = new Adres();
        try {            
            PreparedStatement p = Database.getInstance().getPreparedStatement("SELECT * FROM adres WHERE id = ?");
            p.setInt(1, id);
            
            ResultSet rs = p.executeQuery();
            rs.first();
            AdresDb.vulAdres(a, rs);
        } catch (SQLException e) {}
        return a;
    }
    
    public static int createAdres(Adres a) {
        try {
            PreparedStatement p = Database.getInstance().getPreparedStatement(""
                    + "INSERT INTO `adres` (`plaats`, `straat`, `huisnummer`, `toevoeging`, `postcode`, `soort`, `datetime`) "
                    + "VALUES (?, ?, ?, ?, ?, ?, NOW());");
            p.setString(1, a.getPlaats());
            p.setString(2,a.getStraat());
            p.setInt(3,a.getHuisnummer());
            p.setString(4, a.getToevoeging());
            p.setString(5, a.getPostcode());
            p.setInt(6, a.getSoort());
            
            int rows = p.executeUpdate();
            if(rows > 0) {
                ResultSet rs = p.getGeneratedKeys();
                rs.first();
                a.setId(rs.getInt(1));
                return rs.getInt(1);
            }
        } catch (SQLException e) {}
        return 0;
    }
    
    public static boolean updateAdres(Adres a) {
        try{
            PreparedStatement p = Database.getInstance().getPreparedStatement(""
                    + "UPDATE adres SET "
                    + "plaats = ?, "
                    + "straat = ?,"
                    + "huisnummer = ?,"
                    + "toevoeging = ?"
                    + "postcode = ?,"
                    + "soort = ?"
                    + "WHERE id = ?");
            p.setString(1,a.getPlaats());
            p.setString(2, a.getStraat());
            p.setInt(3,a.getHuisnummer());
            p.setString(4,a.getToevoeging());
            p.setString(5,a.getPostcode());
            p.setInt(6, a.getSoort());
            p.setInt(7, a.getId());
            
            int r = p.executeUpdate();
            if(r > 0) {
                return true;
            }
        } catch (SQLException e) {}
        return false;
    }
    
    public static void vulAdres(Adres a, ResultSet rs) throws SQLException {
        a.setDatetime(rs.getDate("datetime"));
        a.setHuisnummer(rs.getInt("huisnummer"));
        a.setId(rs.getInt("int"));
        a.setPlaats(rs.getString("plaats"));
        a.setPostcode(rs.getString("postcode"));
        a.setSoort(rs.getInt("soort"));
        a.setStraat(rs.getString("straat"));
        a.setToevoeging(rs.getString("toevoeging"));
    }
    
}
