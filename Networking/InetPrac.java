package Networking;

import java.net.*;
import java.io.*;

public class InetPrac {
    
    public static void main(String[] args) {
        try {
            InetAddress addr = InetAddress.getByName("www.google.com");
            System.out.println(addr.getHostName());
            System.out.println(addr.getHostAddress());
            System.out.println(addr.getCanonicalHostName());
            System.out.println(addr.isReachable(5000));
        } catch (UnknownHostException e) {
            System.out.println("Unknown host");
        } catch (IOException e) {
            System.out.println("IO Exception");
        }
    }

}
