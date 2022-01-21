package com.mycompany.decorator;

public class Program {

    public static void main(String[] args) {
        Notifier notifier = new Email();
        notifier = new SlackNotifier(notifier);
        notifier = new SmsNotifier(notifier);
        notifier.sendNotification("Hello World");
    }

    
}
