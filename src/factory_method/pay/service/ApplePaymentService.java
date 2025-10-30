package factory_method.pay.service;

import factory_method.pay.processor.ApplePayProcessor;
import factory_method.pay.processor.KakaoPayProcessor;
import factory_method.pay.processor.PaymentProcessor;

public class ApplePaymentService extends PaymentService {

    @Override
    protected PaymentProcessor getPaymentProcessor() {
        System.out.println("애플페이 결제 서비스 : 신용카드 결제 모듈을 준비합니다.");
        return new ApplePayProcessor();
    }
}
