
package Action;

import Database.GebruikerDB;
import Database.InloggenDB;
import Objecten.Gebruiker;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author kevinvandommele
 */
public class LoginAction extends Action{
    private String gebruikersnaam = null;
    private String wachtwoord = null;
    private boolean ingelogd = false;
    private Gebruiker gebruiker = null;
    
    private int id;
    
    @Override
    public void load(HttpServletRequest hsr) {
       this.gebruikersnaam = hsr.getParameter("gebruikersnaam");
       this.wachtwoord = hsr.getParameter("wachtwoord");
        try {
            this.gebruiker = new Gebruiker(this.gebruikersnaam, this.wachtwoord);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        InloggenDB inlog = new InloggenDB(gebruiker);
        this.ingelogd = inlog.checkLogin(gebruiker);
    }
    
    public boolean getIngelogd(){
        return this.ingelogd;
    }
    
    public void VerwijderGebruiker(HttpServletRequest hsr) throws SQLException{
        this.id = Integer.parseInt(hsr.getParameter("id"));
        GebruikerDB gb = new GebruikerDB();
        gb.verwijderGebruiker(this.id);
    }

    @Override
    public Object get() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean set() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
