/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Objecten;

/**
 *
 * @author kevinvandommele
 */
public class Klacht {
    private int id;
    private int pakketid;
    private String klacht;
    private String commentaar;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPakketid() {
        return pakketid;
    }

    public void setPakketid(int pakketid) {
        this.pakketid = pakketid;
    }

    public String getKlacht() {
        return klacht;
    }

    public void setKlacht(String klacht) {
        this.klacht = klacht;
    }

    public String getCommentaar() {
        return commentaar;
    }

    public void setCommentaar(String commentaar) {
        this.commentaar = commentaar;
    }
}
