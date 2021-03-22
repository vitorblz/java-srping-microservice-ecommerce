package br.com.vitor.checkout.listener;

import br.com.vitor.checkout.entity.CheckoutEntity;
import br.com.vitor.checkout.service.CheckoutService;
import br.com.vitor.checkout.streaming.PaymentPaidSink;
import br.com.vitor.payment.event.PaymentCreatedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
// @EnableBinding(PaymentPaidSink.class)
public class PaymentPaidListener {

    private final CheckoutService checkoutService;

    @StreamListener(PaymentPaidSink.INPUT)
    public void handler(PaymentCreatedEvent paymentCreatedEvent) {
        checkoutService.updateStatus(paymentCreatedEvent.getCheckoutCode().toString(), CheckoutEntity.Status.APPROVED);
    }
}