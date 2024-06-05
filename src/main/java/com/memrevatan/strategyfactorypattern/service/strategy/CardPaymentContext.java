package com.memrevatan.strategyfactorypattern.service.strategy;

import com.memrevatan.strategyfactorypattern.service.CardPaymentService;
import com.memrevatan.strategyfactorypattern.service.factory.CardPaymentFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CardPaymentContext implements CardPaymentStrategy {
    private final CardPaymentFactory cardPaymentFactory;
    @Override
    public void executePayment(String type) {
        CardPaymentService cardPayment = cardPaymentFactory.performType(type);
        cardPayment.pay();
    }
}
