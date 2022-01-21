package com.mycompany.decorator;

public class Email implements Notifier{
    
    @Override
    public void sendNotification(String msg) {
        System.out.println("Sending email notification : " + msg);
    }
}
