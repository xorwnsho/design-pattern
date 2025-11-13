package decorator.notify.concrete_decorator;

import decorator.notify.base_decorator.BaseDecorator;
import decorator.notify.component.Notifier;

public class SlackDecorator extends BaseDecorator {

    public SlackDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);

        sendSlack(message);
    }

    private void sendSlack(String message) {
        System.out.println("[Slack 발송] " + message);
    }
}
