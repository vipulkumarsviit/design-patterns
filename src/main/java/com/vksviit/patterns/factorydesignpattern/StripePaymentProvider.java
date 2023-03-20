package com.vksviit.patterns.factorydesignpattern;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service(StripePaymentProvider.BEAN_ID)
@Slf4j
public class StripePaymentProvider implements PaymentProvider {
    public static final String BEAN_ID = "stripePaymentProvider";

    @Override
    public void acceptPayment() {
        log.info("Accepting payment using Stripe");
    }
}
