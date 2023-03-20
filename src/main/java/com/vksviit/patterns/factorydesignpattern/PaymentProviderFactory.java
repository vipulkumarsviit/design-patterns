package com.vksviit.patterns.factorydesignpattern;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class PaymentProviderFactory {
    private final Map<String, PaymentProvider> paymentProviderMap;

    public PaymentProvider getPaymentProvider(String paymentProviderType) {
        return paymentProviderMap.get(paymentProviderType);
    }
}
