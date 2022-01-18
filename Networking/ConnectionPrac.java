package Networking;

import java.io.*;
import java.net.*;

public class ConnectionPrac {
    
    public static void main(String[] args){

        // Simple url connection example
        try{
            URL url = new URL("http://www.google.com"); // create an url object to store the url
            URLConnection conn = url.openConnection(); // open the connection to the url
            conn.connect(); // connect to the url
            InputStream in = conn.getInputStream(); // get the input stream from the url
            int i = 0;
            //while((i = in.read()) != -1){ // read the input stream
            //    System.out.print((char)i); // print the character
            //}
        }
        catch(Exception e){
            System.out.println(e);
        }

        // http connection
        try{
            URL url = new URL("http://www.google.com"); // create an url object to store the url
            HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
            httpConn.connect(); // connect to the url
            InputStream in = httpConn.getInputStream(); // get the input stream from the url
            int i = 0;
            //while((i = in.read()) != -1){ // read the input stream
            //    System.out.print((char)i); // print the character
            //}
            for(i=1;i<=12;i++){  
                System.out.println(httpConn.getHeaderFieldKey(i)+" = "+httpConn.getHeaderField(i));  
            }  
        }
        catch(Exception e){
            System.out.println(e);
        }

        try{
            System.out.println("this is using openstream");
            URL oracle = new URL("http://www.google.com/");
            BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
            in.close();
        }
        catch(MalformedURLException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }

        try{
            URL oracle = new URL("http://www.google.com/");
            URLConnection yc = oracle.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(
                                        yc.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) 
                System.out.println(inputLine);
            in.close();
        }
        catch(MalformedURLException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
        
    }

}
