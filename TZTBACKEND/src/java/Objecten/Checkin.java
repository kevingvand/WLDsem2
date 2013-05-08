
package Objecten;
/**
 *
 * @author kevinvandommele
 */
import java.util.*;

public class Checkin {

    private int id;
    private int type;
    private int status;
    private int pakketid;
    private String commentaar;
    private int collectiepuntid;
    private int gebruikerid;
    private Date datetime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getPakketid() {
        return pakketid;
    }

    public void setPakketid(int pakketid) {
        this.pakketid = pakketid;
    }

    public String getCommentaar() {
        return commentaar;
    }

    public void setCommentaar(String commentaar) {
        this.commentaar = commentaar;
    }

    public int getCollectiepuntid() {
        return collectiepuntid;
    }

    public void setCollectiepuntid(int collectiepuntid) {
        this.collectiepuntid = collectiepuntid;
    }

    public int getGebruikerid() {
        return gebruikerid;
    }

    public void setGebruikerid(int gebruikerid) {
        this.gebruikerid = gebruikerid;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
}
