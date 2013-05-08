package Tzt;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.cloudmade.api.CMClient;
import com.cloudmade.api.CMClient.MeasureUnit;
import com.cloudmade.api.CMClient.RouteType;
import com.cloudmade.api.geocoding.GeoResult;
import com.cloudmade.api.geocoding.GeoResults;
import com.cloudmade.api.geocoding.ObjectNotFoundException;
import com.cloudmade.api.geometry.Point;
import com.cloudmade.api.routing.Route;
import com.cloudmade.api.routing.RouteNotFoundException;
import java.util.Arrays;

public class Tzt {
    
    

    public static void main(String[] args) {
        
        String beginstraat;
        String beginplaats;
        String eindstraat;
        String eindplaats;        
        beginstraat="lindenlaan";
        beginplaats="rijssen";
        eindstraat="lindenlaan";
        eindplaats="rijssen";
        
        CMClient client = new CMClient("fac9894d6e664a3db3f8f0ad6fd3b64f");
        GeoResults results = client.find(beginstraat +","+beginplaats+",Nederland", 2, 0, null, true, true, true);
        GeoResults results1 = client.find(eindstraat +","+eindplaats+",Nederland", 2, 0, null, true, true, true);
        GeoResult result = results.results[0];
        GeoResult result1 = results1.results[0];
        System.out.println(result.centroid);
        System.out.println(result1.centroid);
        
        //Splitten van de begincoordinaten
        String coordbegin = result.centroid + "";
        String[] coordsbegin = coordbegin.split(",");
        double latitudebegin = Double.parseDouble(coordsbegin[0]);
        double longitudebegin = Double.parseDouble(coordsbegin[1]);
        
        //Splitten van de eindcoordinaten        
        String coordeind = result1.centroid + "";
        String[] coordseind = coordeind.split(",");
        double latitudeeind = Double.parseDouble(coordseind[0]);
        double longitudeeind = Double.parseDouble(coordseind[1]);
        
        //Berekenen afstand hemelsbreed
        double earthRadius = 6371;
        double dLat = Math.toRadians(latitudeeind-latitudebegin);
        double dLng = Math.toRadians(longitudeeind-longitudebegin);
        double sindLat = Math.sin(dLat / 2);
        double sindLng = Math.sin(dLng / 2);
        double a = Math.pow(sindLat, 2) + Math.pow(sindLng, 2)* Math.cos(Math.toRadians(latitudebegin)) * Math.cos(Math.toRadians(latitudeeind));
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        double dist = earthRadius * c;
        System.out.println("latitudebegin" +latitudebegin + "longitudebegin" + longitudebegin + "latitudeeind" + latitudeeind + "longitudeeind" + longitudeeind);
        System.out.println("De afstand is : " + dist);
        
        try {
            result = client.findClosest("station", new Point(latitudebegin,longitudebegin));
            System.out.println(result.properties);
            System.out.println(result.centroid);
        } catch (ObjectNotFoundException e) {
            System.out.println("Er is geen station gevonden in de buurt");
        }
        catch (RuntimeException e) {
            System.out.println("Er is een fout opgetreden tijdens het uitvoeren");
        } 
        
                try {
            Route route = client.route(
                new Point(latitudebegin, longitudebegin),
                new Point(latitudeeind, longitudeeind),
                RouteType.CAR,
                null,
                null,
                "en",
                MeasureUnit.KM
            );

            System.out.println(route.summary.totalDistance);
            System.out.println(route.summary.startPoint);
            System.out.println(route.summary.endPoint);
        } catch (RouteNotFoundException e) {
            System.out.println("Er is geen route gevonden");
        }                      
    }
   
}





