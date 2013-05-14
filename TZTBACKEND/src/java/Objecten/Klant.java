/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Objecten;

/**
 *
 * @author kevinvandommele
 */
public class Klant {
    private int id;
    private String voornaam;
    private String achternaam;
    private String bedrijfsnaam;
    private int adresid;
    private String telefoonummer;
    private String email;
    private String rekeningnummer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getBedrijfsnaam() {
        return bedrijfsnaam;
    }

    public void setBedrijfsnaam(String bedrijfsnaam) {
        this.bedrijfsnaam = bedrijfsnaam;
    }

    public int getAdresid() {
        return adresid;
    }

    public void setAdresid(int adresid) {
        this.adresid = adresid;
    }

    public String getTelefoonummer() {
        return telefoonummer;
    }

    public void setTelefoonummer(String telefoonummer) {
        this.telefoonummer = telefoonummer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRekeningnummer() {
        return rekeningnummer;
    }

    public void setRekeningnummer(String rekeningnummer) {
        this.rekeningnummer = rekeningnummer;
    }
}
