/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Functies;

import Objecten.Gebruiker;
import Server.HttpResponse;
import Server.URLRequest;
import com.google.gson.Gson;

/**
 *
 * @author kevinvandommele
 */
public class CreateObjectFromJson{
    private String json;
    
        public CreateObjectFromJson() throws Exception{
            String url = "http://localhost:8080/TZTBackend/Test";
            String resp = URLRequest.getPage(url);
            Gson gson = new Gson();
            HttpResponse hr = gson.fromJson(resp, HttpResponse.class);
            System.out.println(hr.getData());
            
            Gebruiker geb = new Gson().fromJson(hr.getData(), Gebruiker.class);
            System.out.println(geb);
        }
}