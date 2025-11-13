package decorator.notify;

import decorator.notify.component.Notifier;
import decorator.notify.concrete_component.BasicNotifier;
import decorator.notify.concrete_decorator.FacebookDecorator;
import decorator.notify.concrete_decorator.SMSDecorator;
import decorator.notify.concrete_decorator.SlackDecorator;

public class Main {
    public static void main(String[] args) {

        System.out.println("---1. 기본 알림 ---");
        Notifier basicNotifier = new BasicNotifier();
        basicNotifier.send("서버 점검 중입니다.");

        System.out.println("\n---2. 기본 + SMS 알림---");
        Notifier smsNotifier = new SMSDecorator(new BasicNotifier());
        smsNotifier.send("서버에 장애가 발생했습니다.");

        System.out.println("\n---3. 기본 + SMS + Facebook + Slack 알림");
        Notifier allNotifier = new SlackDecorator(new SMSDecorator(new FacebookDecorator(new BasicNotifier())));
        allNotifier.send("배포가 완료되었습니다.");
    }
}
