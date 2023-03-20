package com.vksviit.patterns.factorydesignpattern;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class FactoryDesignPatternApplication implements CommandLineRunner {

	@Autowired
	PaymentProviderFactory paymentProviderFactory;
	public static void main(String[] args) {
		SpringApplication.run(FactoryDesignPatternApplication.class, args);
	}

	@Override
	public void run(String... args) {
		log.info("Hello spring boot");
		// Provides StripePaymentProvider instance usage the same to accept payment
		paymentProviderFactory.getPaymentProvider(StripePaymentProvider.BEAN_ID).acceptPayment();

		// Provides PayPalPaymentProvider instance usage the same to accept payment
		paymentProviderFactory.getPaymentProvider(PayPalPaymentProvider.BEAN_ID).acceptPayment();

		// Provides PayUPaymentProvider instance usage the same to accept payment
		paymentProviderFactory.getPaymentProvider(PayUPaymentProvider.BEAN_ID).acceptPayment();

	}
}
