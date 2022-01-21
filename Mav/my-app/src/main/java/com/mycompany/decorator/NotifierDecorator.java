package com.mycompany.decorator;

public class NotifierDecorator implements Notifier{
    private Notifier notifier;

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void sendNotification(String msg) {
        notifier.sendNotification(msg);
    }
}
