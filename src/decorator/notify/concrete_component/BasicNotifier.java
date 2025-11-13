package decorator.notify.concrete_component;

import decorator.notify.component.Notifier;

public class BasicNotifier implements Notifier {

    @Override
    public void send(String message) {
        System.out.println("기본 알림 발송: " + message);
    }
}
