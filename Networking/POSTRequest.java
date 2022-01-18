package Networking;

import java.net.*;
import java.io.*;

public class POSTRequest {
    
    public static void main(String[] args){

        try{
            URL url = new URL("https://jsonplaceholder.typicode.com/posts");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);

            conn.setRequestMethod("POST");
            conn.addRequestProperty("Content-Type", "application/json");

            String content = "{\"title\":\"foo\",\"body\":\"bar\",\"userId\":1}";

            OutputStream out = conn.getOutputStream();
            out.write(content.getBytes("UTF-8"));
            out.flush();
            out.close();

            int responseCode = conn.getResponseCode();
            System.out.println("POST Response Code :: " + responseCode);
            if(responseCode == HttpURLConnection.HTTP_CREATED){
                System.out.println("Success");
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String response;
                StringBuffer responseContent = new StringBuffer();
                while((response = in.readLine()) != null){
                    responseContent.append(response);
                }

                System.out.println(responseContent.toString());
            }
            else{
                System.out.println("Failure");
            }


        }
        catch(Exception e){
            System.out.println(e);
        }

    }

}
