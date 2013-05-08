package Server;


import com.google.gson.Gson;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
public class HttpResponse {
    private int statuscode;
    private String data;

    HttpResponse(int statuscode, Object data) {
        Gson g = new Gson();
        this.setData(g.toJson(data));
        this.setStatuscode(statuscode);
    }
    
    public String toString() {
        Gson g = new Gson();
        return g.toJson(this);        
    }

    /**
     * @return the statuscode
     */
    public int getStatuscode() {
        return statuscode;
    }

    /**
     * @param statuscode the statuscode to set
     */
    public void setStatuscode(int statuscode) {
        this.statuscode = statuscode;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }
}
