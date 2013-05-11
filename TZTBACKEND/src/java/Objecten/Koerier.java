/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Objecten;

/**
 *
 * @author kevinvandommele
 */
public class Koerier {
    private int id;
    private String naam;
    private double tarief;
    private int adresid;
    private int telefoonnummer;
    private String email;
    
    public Koerier(int id, String naam, double tarief, int adresid, int telefoonnummer, String email){
        this.id = id;
        this.naam = naam;
        this.tarief = tarief;
        this.adresid = adresid;
        this.telefoonnummer = telefoonnummer;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getTarief() {
        return tarief;
    }

    public void setTarief(double tarief) {
        this.tarief = tarief;
    }

    public int getAdresid() {
        return adresid;
    }

    public void setAdresid(int adresid) {
        this.adresid = adresid;
    }

    public int getTelefoonnummer() {
        return telefoonnummer;
    }

    public void setTelefoonnummer(int telefoonnummer) {
        this.telefoonnummer = telefoonnummer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String toString(){
        return "Koerier: " + this.naam + " | ";
    }
}
