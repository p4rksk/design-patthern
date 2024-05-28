package ex06.notification;

public class SmsNotifier implements Notifier {

    private Notifier notifier;

    public SmsNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send() {
        if (notifier != null) notifier.send(); // 기능 확장
        System.out.println("문자 알림");
    }
}
