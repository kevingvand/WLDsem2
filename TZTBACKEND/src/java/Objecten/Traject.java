
package Objecten;
/**
 *
 * @author kevinvandommele
 */
import java.util.*;
public class Traject {

    private int id;
    private int afstand;
    private int koerierid;
    private Date datetime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAfstand() {
        return afstand;
    }

    public void setAfstand(int afstand) {
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
}
