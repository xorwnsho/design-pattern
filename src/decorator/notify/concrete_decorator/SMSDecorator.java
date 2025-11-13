package decorator.notify.concrete_decorator;

import decorator.notify.base_decorator.BaseDecorator;
import decorator.notify.component.Notifier;

public class SMSDecorator extends BaseDecorator {

    public SMSDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);

        sendSMS(message);
    }

    private void sendSMS(String message) {
        System.out.println("[SMS 발송] " + message);
    }
}
