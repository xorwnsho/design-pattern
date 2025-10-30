package factory_method.pay;

import factory_method.pay.service.CreditCardPaymentService;
import factory_method.pay.service.KakaoPaymentService;
import factory_method.pay.service.PaymentService;

public class paymentTestDrive {
    public static void main(String[] args) {

        PaymentService paymentService;

        System.out.println("====신용카드 결제====");
        paymentService =new CreditCardPaymentService();
        paymentService.processPayment(10000);

        System.out.println("====카카오페이 결제====");
        paymentService =new KakaoPaymentService();
        paymentService.processPayment(13000);
    }
}
