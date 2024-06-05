package com.memrevatan.strategyfactorypattern.config;

import com.memrevatan.strategyfactorypattern.service.strategy.CardPaymentContext;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CommandLineConfiguration implements CommandLineRunner {
    private final CardPaymentContext context;

    @Override
    public void run(String... args) {
        context.executePayment("debit");
    }
}
