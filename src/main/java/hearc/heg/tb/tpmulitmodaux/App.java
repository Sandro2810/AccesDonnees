package hearc.heg.tb.tpmulitmodaux;

import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Requête Tranport API
        String urlTP = "http://transport.opendata.ch/v1/connections?"
            + "from=Lausanne"
            + "&to=Genève"
            + "&date=2021-12-20"
            + "&time=14:00"
            + "&limit=1";

        //Requête Distance Matrix API
        String urlDM = "https://maps.googleapis.com/maps/api/distancematrix/json?"
            + "destinations=Bienne"
            + "&origins=Grand'rue 72, Péry"
            + "&mode=walking"
            + "&key=AIzaSyBtpcUMs7e8RkwRuLy9K-0aoXiztwAGobU";

        //Requête Geocoding API
        String urlGC = "https://maps.googleapis.com/maps/api/geocode/json?"
            + "address=Grand'rue 72, Péry"
            + "&key=AIzaSyBtpcUMs7e8RkwRuLy9K-0aoXiztwAGobU";

        //Requête Nearby Search API
        String urlNS = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?"
            + "keyword=velospot"
            + "&location=47.159138%2C7.291380"
            + "&rankby=distance"
            + "&key=AIzaSyBtpcUMs7e8RkwRuLy9K-0aoXiztwAGobU";

        //Requête ShareMobility API
        String urlSM = "https://api.sharedmobility.ch/v1/sharedmobility/identify?"
            + "filters=ch.bfe.sharedmobility.vehicle_type=Car"
            + "&Geometry=7.2467909, 47.1367785"
            + "&Tolerance=200"
            + "&offset=0"
            + "&geometryFormat=esrijson";

        //Instance de la classe AccesOkHttp
        AccesOkHttp acces = new AccesOkHttp();

        //Afficher les données de la requête Transport API
        //acces.accederDonnees(urlTP);

        //Afficher les données de la requête Distance Matrix API
        //acces.accederDonnees(urlDM);

        //Afficher les données de la requête Geocoding API
        //acces.accederDonnees(urlGC);

        //Afficher les données de la requête NearbySearch API
        //acces.accederDonnees(urlNS);

        //Afficher les données de la requête ShareMobility API
        acces.accederDonnees(urlSM);
    }
}
