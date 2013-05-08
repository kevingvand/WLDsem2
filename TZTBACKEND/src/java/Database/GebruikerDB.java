
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kevinvandommele
 */
public class GebruikerDB {
    private Connection connection = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String gebruikersnaam = null;
    private String wachtwoord = null;
    private DriverManager DriverManager = null;
    private int id;
    
    public GebruikerDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection("jdbc:mysql://159.253.7.224:3306/kevined104_tzt", "kevined104_tzt", "tzters");
        }
        catch(ClassNotFoundException e){
            e.getMessage();
        }
        catch(SQLException e){
            e.getMessage();
        }
    }
    
    public int getId(String gebruikersnaam) throws SQLException{
        ps = connection.prepareStatement("SELECT id FROM gebruiker WHERE gebruikersnaam = ?");
        ps.setString(1, gebruikersnaam);
        this.rs = ps.executeQuery();
        if(rs.next()){
            this.id = rs.getInt(1);
        } else {
            return 0;
        }
        System.out.println(id);
        return id;
    }
    
    public void maakGebruiker(String gebruikersnaam, String wachtwoord) throws SQLException{
        ps = connection.prepareStatement("INSERT INTO gebruiker (gebruikersnaam, wachtwoord) VALUES (?,?)");
        ps.setString(1, gebruikersnaam);
        ps.setString(2, wachtwoord);
        ps.executeUpdate();
    }
    
    public void verwijderGebruiker(int id) throws SQLException{
        ps = connection.prepareStatement("DELETE FROM gebruiker WHERE id = ?");
        ps.setInt(1, id);
        ps.executeUpdate();
    }
}
