/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Objecten;

/**
 *
 * @author kevinvandommele
 */
public class Notificatie {
    private String bericht;
    private int pakketid;
    private int statuscode;

    public String getBericht() {
        return bericht;
    }

    public void setBericht(String bericht) {
        this.bericht = bericht;
    }

    public int getPakketid() {
        return pakketid;
    }

    public void setPakketid(int pakketid) {
        this.pakketid = pakketid;
    }

    public int getStatuscode() {
        return statuscode;
    }

    public void setStatuscode(int statuscode) {
        this.statuscode = statuscode;
    }
}
