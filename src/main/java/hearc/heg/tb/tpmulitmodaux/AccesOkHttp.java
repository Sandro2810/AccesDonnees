package hearc.heg.tb.tpmulitmodaux;

import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class AccesOkHttp {

  //Methode permettant d'accéder et visualiser les données a partir d'une requête
  public void accederDonnees(String url){
    //Création du client
    OkHttpClient client = new OkHttpClient();
    //Création de la requête
    Request request = new Request.Builder().url(url).build();
    try {
      //Recuperation de la reponse de l'appel
      Response response = client.newCall(request).execute();
      //affichage
      System.out.println(response.body().string());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
