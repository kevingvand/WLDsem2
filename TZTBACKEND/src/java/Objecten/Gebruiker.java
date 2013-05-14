/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Objecten;

import Database.GebruikerDB;
import java.sql.SQLException;

/**
 *
 * @author kevinvandommele
 */
public class Gebruiker {
    private int id;
    private String gebruikersnaam;
    private String wachtwoord;
    private int rol;
    
    public Gebruiker() {
        
    }
    
    public Gebruiker(int id, String gebruikersnaam, String wachtwoord){
        this.id = id;
        this.gebruikersnaam = gebruikersnaam;
        this.wachtwoord = wachtwoord;
    }
    
    public Gebruiker(String gebruikersnaam, String wachtwoord) throws SQLException{
        GebruikerDB gbdb = new GebruikerDB();
        if(gbdb.getId(gebruikersnaam) == 0){
            this.id = 0;
            this.gebruikersnaam = null;
            this.wachtwoord = null;
        } else {
            this.id = gbdb.getId(gebruikersnaam);
            this.gebruikersnaam = gebruikersnaam;
            this.wachtwoord = wachtwoord;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGebruikersnaam() {
        return gebruikersnaam;
    }

    public void setGebruikersnaam(String gebruikersnaam) {
        this.gebruikersnaam = gebruikersnaam;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public void setWachtwoord(String wachtwoord) {
        this.wachtwoord = wachtwoord;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }
    
    public String toString(){
        return "Dit is gebruiker: " + this.id + " | " + this.gebruikersnaam + ". Het versleutelde wachwoord is: " + this.wachtwoord;
    }
}
