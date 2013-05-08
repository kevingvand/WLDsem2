/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tzt;
import com.cloudmade.api.CMClient;
import com.cloudmade.api.CMClient.MeasureUnit;
import com.cloudmade.api.CMClient.RouteType;
import com.cloudmade.api.geometry.Point;
import com.cloudmade.api.routing.Route;
import com.cloudmade.api.routing.RouteNotFoundException;

public class GetRoute {
    public static void main(String[] args) {
        CMClient client = new CMClient("fac9894d6e664a3db3f8f0ad6fd3b64f");

        try {
            Route route = client.route(
                new Point(47.25976, 9.58423),
                new Point(47.66117, 9.99882),
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
            
        }
    }
}