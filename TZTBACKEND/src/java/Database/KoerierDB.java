/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Objecten.Koerier;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author kevinvandommele
 */
public class KoerierDB {
    private Connection connection = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private DriverManager DriverManager = null;
    private ArrayList<Koerier> koerierslijst;
    
    public KoerierDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection("jdbc:mysql://159.253.7.224:3306/kevined104_tzt", "kevined104_tzt", "tzters");
        }
        catch(ClassNotFoundException e){
            e.getMessage();
        }
        catch(SQLException e){
            e.getMessage();
        }
        this.koerierslijst = new ArrayList<Koerier>();
    }
    
    public void fillKoeriersLijst() throws SQLException{
        ps = connection.prepareStatement("SELECT * FROM koerier");
        this.rs = ps.executeQuery();
        while(rs.next()){
            Koerier koerier = new Koerier(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4), rs.getInt(5), rs.getString(6));
            this.koerierslijst.add(koerier);
        }
    }
    
    public ArrayList<Koerier> getKoerierslijst(){
        return this.koerierslijst;
    }
}
