/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Objecten.Klant;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Daniel
 */
public class KlantDb {
    
    public static Klant getById(int id) {
        Klant k = new Klant();
        try{
            PreparedStatement p = Database.getInstance().getPreparedStatement("SELECT * FROM klant WHERE id = ?");
            p.setInt(1, id);
            ResultSet rs = p.executeQuery();
            rs.first();
            KlantDb.vulKlant(k, rs);
        } catch(SQLException e) {}
        return k;
    }
    
    public static void vulKlant(Klant k, ResultSet rs) throws SQLException {
        k.setAchternaam(rs.getString("achternaam"));
        k.setAdresid(rs.getInt("adresi"));
        k.setBedrijfsnaam(rs.getString("bedrijfsnaam"));
        k.setEmail(rs.getString("email"));
        k.setId(rs.getInt("id"));
        k.setRekeningnummer(rs.getString("rekeningnummer"));
        k.setTelefoonummer(rs.getString("telefoonnummer"));
        k.setVoornaam(rs.getString("voornaam"));
    }
}
