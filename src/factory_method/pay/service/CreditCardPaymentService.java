package factory_method.pay.service;

import factory_method.pay.processor.CreditCardProcessor;
import factory_method.pay.processor.PaymentProcessor;

public class CreditCardPaymentService extends PaymentService {

    @Override
    protected PaymentProcessor getPaymentProcessor() {
        System.out.println("신용카드 결제 서비스 : 신용카드 결제 모듈을 준비합니다.");
        return new CreditCardProcessor();
    }
}
