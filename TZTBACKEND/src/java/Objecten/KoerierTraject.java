/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Objecten;

/**
 *
 * @author kevinvandommele
 */
public class KoerierTraject extends Traject {
    private Collectiepunt van;
    private Collectiepunt naar;

    public Collectiepunt getVan() {
        return van;
    }

    public void setVan(Collectiepunt van) {
        this.van = van;
    }

    public Collectiepunt getNaar() {
        return naar;
    }

    public void setNaar(Collectiepunt naar) {
        this.naar = naar;
    }
}
