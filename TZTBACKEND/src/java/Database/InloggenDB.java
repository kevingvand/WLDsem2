/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Objecten.Gebruiker;
import Objecten.Gebruiker;
import java.sql.*;

/**
 *
 * @author kevinvandommele
 */
public class InloggenDB {
    private Connection connection = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String gebruikersnaam = null;
    private String wachtwoord = null;
    private DriverManager DriverManager = null;
    
    public InloggenDB(Gebruiker gebruiker){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection("jdbc:mysql://159.253.7.224:3306/kevined104_tzt", "kevined104_tzt", "tzters");
            ps = connection.prepareStatement("SELECT gebruikersnaam, wachtwoord FROM gebruiker WHERE id = ?");
            ps.setInt(1, gebruiker.getId());
            rs = ps.executeQuery();
            if(rs.next()){
                this.gebruikersnaam = rs.getString("gebruikersnaam");
                this.wachtwoord = rs.getString("wachtwoord");
            }
            connection.close();
            ps.close();
        }
        catch(ClassNotFoundException e){
            e.getMessage();
        }
        catch(SQLException e){
            e.getMessage();
        }
    }
    
    public boolean checkLogin(Gebruiker gebruiker){
        if(gebruiker.getGebruikersnaam() != null && this.gebruikersnaam.equals(gebruiker.getGebruikersnaam()) && this.wachtwoord.equals(gebruiker.getWachtwoord())){
            System.out.println("jup");
            return true;
        } else {
            System.out.println("nop");
            return false;
        }
    }
    
    /*
     * Bij het inloggen moet eerst worden gekeken of er een gebruiker in de database zit met die gebruikersnaam
     * dan kijkt hij of het wachtwoord matcht met het wachtwoord bij die gebruiker zit.
     * als dat zo is returnt hij true.
     */
}
