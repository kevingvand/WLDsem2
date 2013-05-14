/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Objecten;

/**
 *
 * @author kevinvandommele
 */
public class Collectiepunt {
    private int id;
    private String naam;
    private int actief;
    private int verantwoordelijke;
    private int adresid;
    private double latitude;
    private double longitude;

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

    public int getActief() {
        return actief;
    }

    public void setActief(int actief) {
        this.actief = actief;
    }

    public int getVerantwoordelijke() {
        return verantwoordelijke;
    }

    public void setVerantwoordelijke(int verantwoordelijke) {
        this.verantwoordelijke = verantwoordelijke;
    }

    public int getAdresid() {
        return adresid;
    }

    public void setAdresid(int adresid) {
        this.adresid = adresid;
    }

    /**
     * @return the latitude
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * @param latitude the latitude to set
     */
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    /**
     * @return the longitude
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * @param longitude the longitude to set
     */
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

}
