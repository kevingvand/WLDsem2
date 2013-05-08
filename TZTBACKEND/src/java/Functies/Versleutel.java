/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiepunt;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author kevinvandommele
 */

public class Versleutel {
    public static String versleutel(String tekst){
        String versleutelen = tekst + "123" + tekst + "321" +  tekst;
        String digest = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hash = md.digest(versleutelen.getBytes("UTF-8"));

            StringBuilder ab = new StringBuilder(2*hash.length);
            for(byte b : hash){
                ab.append(String.format("%02x", b&0xff));
            }
            digest = ab.toString();
            }
        catch(UnsupportedEncodingException ex){
            ex.getMessage();
        }
        catch(NoSuchAlgorithmException ex){
            ex.getMessage();
        }

        return digest;
    }
}
