package com.memrevatan.strategyfactorypattern.service;

import org.springframework.stereotype.Service;

@Service("credit")
public class CreditCardPaymentServiceImpl implements CardPaymentService {
    @Override
    public void pay() {
        System.out.println("credit");
    }
}
