package factory_method.pay.service;

import factory_method.pay.processor.CreditCardProcessor;
import factory_method.pay.processor.KakaoPayProcessor;
import factory_method.pay.processor.PaymentProcessor;

public class KakaoPaymentService extends PaymentService {

    @Override
    protected PaymentProcessor getPaymentProcessor() {
        System.out.println("카카오페이 결제 서비스 : 신용카드 결제 모듈을 준비합니다.");
        return new KakaoPayProcessor();
    }
}
