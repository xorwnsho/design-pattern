package factory_method.pay.processor;

public class KakaoPayProcessor implements PaymentProcessor {

    public KakaoPayProcessor() {
        System.out.println("-> 카카오페이 결제 모듈 활성화됨");
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("[카카오페이 결제] : " + amount + "원 결제를 시도합니다...");
        System.out.println("[카카오페이 결제] : 승인 완료");
        return true;
    }
}
