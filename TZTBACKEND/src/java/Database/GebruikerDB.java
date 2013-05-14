
package Database;

import Objecten.Gebruiker;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Daniel
 */
public class GebruikerDB {
    /**
     *
     * @param g
     * @param rs
     */
    public static void vulGebruiker(Gebruiker g, ResultSet rs) throws SQLException {
        g.setGebruikersnaam(rs.getString("gebruikersnaam"));
        g.setId(rs.getInt("id"));
        g.setRol(rs.getInt("rol"));
        g.setWachtwoord(rs.getString("wachtwoord"));
    } 
}
