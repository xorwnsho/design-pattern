package factory_method.pay.service;

import factory_method.pay.processor.PaymentProcessor;

public abstract class PaymentService {

    public void processPayment(double amount){

        System.out.println("---결제 프로세스 시작 (금액 : " + amount + "원) ---");

        PaymentProcessor processor = getPaymentProcessor();

        boolean result = processor.pay(amount);
    }

    protected abstract PaymentProcessor getPaymentProcessor();
}
