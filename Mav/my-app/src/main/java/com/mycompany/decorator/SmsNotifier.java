package com.mycompany.decorator;

public class SmsNotifier extends NotifierDecorator {
    
    public SmsNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void sendNotification(String msg) {
        super.sendNotification(msg);
        System.out.println("Sending sms notification : " + msg);
    }

}
