package factory_method.pay.processor;

public class ApplePayProcessor implements PaymentProcessor {

    public ApplePayProcessor() {
        System.out.println("-> 애플페이 결제 모듈 활성화됨");
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("[애플페이 결제] : " + amount + "원 결제를 시도합니다...");
        System.out.println("[애플페이 결제] : 승인 완료");
        return true;
    }
}
