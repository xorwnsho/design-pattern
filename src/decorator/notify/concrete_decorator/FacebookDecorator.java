package decorator.notify.concrete_decorator;

import decorator.notify.base_decorator.BaseDecorator;
import decorator.notify.component.Notifier;

public class FacebookDecorator extends BaseDecorator {

    public FacebookDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);

        sendFacebook(message);
    }

    private void sendFacebook(String message) {
        System.out.println("[Facebook 발송] " + message);
    }
}
