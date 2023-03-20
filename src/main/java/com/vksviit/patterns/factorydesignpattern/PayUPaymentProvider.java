package com.vksviit.patterns.factorydesignpattern;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service(PayUPaymentProvider.BEAN_ID)
@Slf4j
public class PayUPaymentProvider implements PaymentProvider {
    public static final String BEAN_ID = "payUPaymentProvider";

    @Override
    public void acceptPayment() {
        log.info("Accepting payment using PayU");
    }
}
