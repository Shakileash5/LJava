package Networking;

import java.net.*;
import java.io.*;

public class GETRequest {
    
    public static void main(String[] args) {
        try {

            // Create a URL object
            URL url = new URL("https://reqres.in/api/products/3?id=3");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("userId", "Shaki");

            int responseCode = connection.getResponseCode();
            System.out.println("\nSending 'GET' request to URL : " + url);  
            System.out.println("Response Code : " + responseCode);

            if(responseCode == 200) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();

                while((inputLine = in.readLine()) != null){
                    response.append(inputLine);
                }
                in.close();

                //print result
                System.out.println(response.toString());
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

}
