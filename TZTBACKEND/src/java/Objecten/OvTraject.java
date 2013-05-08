/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Objecten;

/**
 *
 * @author kevinvandommele
 */
public class OvTraject extends Traject{
    private Adres vanAdres = null;
    private Adres naarAdres = null;
    private Collectiepunt naarCollectiepunt = null;
    private Collectiepunt vanCollectiepunt = null;

    public Adres getVanAdres() {
        return vanAdres;
    }

    public void setVanAdres(Adres vanAdres) {
        this.vanAdres = vanAdres;
    }

    public Adres getNaarAdres() {
        return naarAdres;
    }

    public void setNaarAdres(Adres naarAdres) {
        this.naarAdres = naarAdres;
    }

    public Collectiepunt getNaarCollectiepunt() {
        return naarCollectiepunt;
    }

    public void setNaarCollectiepunt(Collectiepunt naarCollectiepunt) {
        this.naarCollectiepunt = naarCollectiepunt;
    }

    public Collectiepunt getVanCollectiepunt() {
        return vanCollectiepunt;
    }

    public void setVanCollectiepunt(Collectiepunt vanCollectiepunt) {
        this.vanCollectiepunt = vanCollectiepunt;
    }
}
