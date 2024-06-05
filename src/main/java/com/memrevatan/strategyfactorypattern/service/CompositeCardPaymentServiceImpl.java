package com.memrevatan.strategyfactorypattern.service;

import org.springframework.stereotype.Service;

@Service("composite")
public class CompositeCardPaymentServiceImpl implements CardPaymentService {
    @Override
    public void pay() {
        System.out.println("composite pay!");
    }
}
