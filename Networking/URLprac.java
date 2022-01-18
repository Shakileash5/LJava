package Networking;

import java.net.*;

public class URLprac {
    
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.google.com");
            System.out.println(url.getProtocol());
            System.out.println("HOST:"+url.getHost());
            System.out.println("port:"+url.getPort());
            System.out.println(url.getFile());
            System.out.println(url.getPath());
            System.out.println(url.getQuery());
            System.out.println(url.getRef());

            URL urlNext = new URL("https://www.google.com/search?q=javatpoint&oq=javatpoint&sourceid=chrome&ie=UTF-8"); 
            System.out.println("Protocol: "+urlNext.getProtocol());
            System.out.println("Host: "+urlNext.getHost());
            System.out.println("Port: "+urlNext.getPort());
            System.out.println("File: "+urlNext.getFile());
            System.out.println("Path: "+urlNext.getPath());
            System.out.println("Query: "+urlNext.getQuery());

        } catch (MalformedURLException e) {
            System.out.println("Malformed URL");
        }
    }

}
