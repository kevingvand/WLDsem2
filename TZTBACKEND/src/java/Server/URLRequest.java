package Server;

import java.net.*;
import java.io.*;
import java.util.Calendar;
import java.sql.*;

public class URLRequest {
    public static String getPage(URL url) throws Exception {        
        URLConnection yc = url.openConnection();
        BufferedReader in = new BufferedReader(
                                new InputStreamReader(
                                yc.getInputStream()));
        String inputLine;
        String returnValue = "";
        while ((inputLine = in.readLine()) != null)  {
            returnValue += inputLine;
        }
        in.close();
        return returnValue;
    }
    
    public static String getPage(String url) throws Exception {
        URL urlObject = new URL(url);
        return getPage(urlObject);
    }
}