package br.com.vitor.checkout.config;

import br.com.vitor.checkout.streaming.CheckoutCreatedSource;
import br.com.vitor.checkout.streaming.PaymentPaidSink;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(value = {
      CheckoutCreatedSource.class,
      PaymentPaidSink.class
})
public class StreamingConfig {
}