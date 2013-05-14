
package Objecten;
/**
 *
 * @author kevinvandommele
 */
import java.util.*;
public class Traject {

    private int id;
    private double afstand;
    private int koerierid;
    private Date datetime;
    private int beginlocatie;
    private int eindlocatie;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAfstand() {
        return afstand;
    }

    public void setAfstand(int afstand) {
        this.afstand = afstand;
    }

    public void setAfstand(double afstand) {
        this.afstand = afstand;
    }

    public int getKoerierid() {
        return koerierid;
    }

    public void setKoerierid(int koerierid) {
        this.koerierid = koerierid;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    /**
     * @return the beginlocatie
     */
    public int getBeginlocatie() {
        return beginlocatie;
    }

    /**
     * @param beginlocatie the beginlocatie to set
     */
    public void setBeginlocatie(int beginlocatie) {
        this.beginlocatie = beginlocatie;
    }

    /**
     * @return the eindlocatie
     */
    public int getEindlocatie() {
        return eindlocatie;
    }

    /**
     * @param eindlocatie the eindlocatie to set
     */
    public void setEindlocatie(int eindlocatie) {
        this.eindlocatie = eindlocatie;
    }
}
