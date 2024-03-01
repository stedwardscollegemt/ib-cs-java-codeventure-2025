package cloud_service_example;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class CloudDataServiceWrapper {

    static final String URL_GET_BASE_TOKEN_EXTERNAL_LINK = "https://cloud.seatable.io/api/v2.1/external-link-tokens/af07bab80c4940579785/access-token/";
    static final String URL_GET_BASE_TOKEN_API_TOKEN = "https://cloud.seatable.io/api/v2.1/dtable/app-access-token/";

    // you get this from your sea table account [https://account.seatable.io/bases]
    private static final String API_TOKEN = "cf5b4e09aa8f0ed9f150aa30badf3392cba5d95d";

    /**
     * --- Authentication Methods ------------------------------------------------------
     * @return
     */
    public static APICredentials getBaseTokenWithApiToken() {
        APICredentials apiCredentials = null;
        try {
            // prepare request
            URL url = new URL(URL_GET_BASE_TOKEN_API_TOKEN);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.addRequestProperty("Authorization", "Bearer " + API_TOKEN);

            // get response from server
            int status = con.getResponseCode();
            if (status == HttpURLConnection.HTTP_OK) {
                // store response in a string
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuilder content = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
                in.close();

                // parse response
                Gson gson = new Gson();
                apiCredentials = gson.fromJson(content.toString(), APICredentials.class);
                return apiCredentials;
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
        return apiCredentials;
    }

    public static APICredentials getBaseTokenWithExternalLink() {
        APICredentials apiCredentials = null;
        try {
            // prepare request
            URL url = new URL(URL_GET_BASE_TOKEN_EXTERNAL_LINK);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            // get response from server
            int status = con.getResponseCode();
            if (status == HttpURLConnection.HTTP_OK) {
                // store response in a string
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuilder content = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
                in.close();

                // parse response
                Gson gson = new Gson();
                apiCredentials = gson.fromJson(content.toString(), APICredentials.class);
                return apiCredentials;
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
        return apiCredentials;
    } 

    /**
     * --- Events -----------------------------------------------------------------------
     */
    

}
