package com.memrevatan.strategyfactorypattern.service.factory;

import com.memrevatan.strategyfactorypattern.service.CardPaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Objects;

@Component
@RequiredArgsConstructor
public class CardPaymentFactory {
    private final Map<String, CardPaymentService> cardPaymentStrategies;

    public CardPaymentService performType(String type) {
        if (Objects.isNull(type))
            throw new IllegalArgumentException("Unknown payment type");
        return cardPaymentStrategies.get(type);
    }

}
