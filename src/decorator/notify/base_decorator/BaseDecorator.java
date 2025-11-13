package decorator.notify.base_decorator;

import decorator.notify.component.Notifier;

public abstract class BaseDecorator implements Notifier {

    protected Notifier notifier;

    public BaseDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send(String message) {
        notifier.send(message);
    }
}
