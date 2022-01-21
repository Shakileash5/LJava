package com.mycompany.decorator;

public class SlackNotifier extends NotifierDecorator{
    
    public SlackNotifier(Notifier notifier){
        super(notifier);
    }

    @Override
    public void sendNotification(String msg) {
        super.sendNotification(msg);
        System.out.println("Sending slack notification : " + msg);
    }

}
