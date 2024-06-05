package com.memrevatan.strategyfactorypattern.service;

import org.springframework.stereotype.Service;

@Service("debit")
public class DebitCardPaymentServiceImpl implements CardPaymentService {
    @Override
    public void pay() {
        System.out.println("debit pay!");
    }
}
