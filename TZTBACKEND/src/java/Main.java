/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Database.KoerierDB;
import java.sql.SQLException;

/**
 *
 * @author kevinvandommele
 */
public class Main {
   
    
    public static void main(String[] args) throws SQLException, Exception{
       // CreateObjectFromJson cofj = new CreateObjectFromJson();
        KoerierDB koerier = new KoerierDB();
        koerier.fillKoeriersLijst();
        
        System.out.println(koerier.getKoerierslijst());
    }
    
}
