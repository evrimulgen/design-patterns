package com.patterns.decorator.notificator.decorator;

import com.patterns.decorator.notificator.Notifier;

public class SmsDecorator extends BaseDecorator {

    public SmsDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void sendMessage(String message) {
        super.sendMessage(message);
        System.out.println("Sms: " + message);
    }
}
