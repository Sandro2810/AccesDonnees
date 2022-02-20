package hearc.heg.tb.tpmulitmodaux;

import java.io.IOException;
import java.util.Scanner;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        //Requête Tranport API
        String urlTP = "http://transport.opendata.ch/v1/connections?from=Joh. Hein. Laubscher-Weg 26, 2503 Biel&to=Rue du Musée 23, 2502 Bienne&limit=1";

        //Requête Distance Matrix API
        String urlDM = "https://maps.googleapis.com/maps/api/distancematrix/json?"
            + "destinations=Effingerstrasse 27, Bern"
            + "&origins=Prilly , Église, 1008 Prilly, Switzerland"
            + "&mode=driving"
            + "&key=AIzaSyDF_tUT0e-vPFg4zLpsC7VXglt-3UbQUVY";

        //Requête Geocoding API
        String urlGC = "https://maps.googleapis.com/maps/api/geocode/json?"
            + "address=47.5360348, 7.5854429"
            + "&key=AIzaSyDF_tUT0e-vPFg4zLpsC7VXglt-3UbQUVY";

        //Requête Nearby Search API
        String urlNS = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?"
            + "keyword=velospot"
            + "&location=47.1329843,7.242969899999999"
            + "&rankby=distance"
            + "&key=AIzaSyDF_tUT0e-vPFg4zLpsC7VXglt-3UbQUVY";

        //Requête ShareMobility API
        String urlSM = "https://api.sharedmobility.ch/v1/sharedmobility/identify?"
            + "Geometry=7.242969899999999, 47.1329843"
            + "&Tolerance=500"
            + "&offset=0"
            + "&geometryFormat=esrijson";

        //Instance de la classe AccesOkHttp
        AccesOkHttp acces = new AccesOkHttp();

        //Afficher les données de la requête Transport API
        //acces.accederDonnees(urlTP);

        //Afficher les données de la requête Distance Matrix API
        acces.accederDonnees(urlDM);

        //Afficher les données de la requête Geocoding API
        acces.accederDonnees(urlGC);

        //Afficher les données de la requête NearbySearch API
        acces.accederDonnees(urlNS);

        //Afficher les données de la requête ShareMobility API
        //acces.accederDonnees(urlSM);

    }

}
