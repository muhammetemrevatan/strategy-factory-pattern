package com.memrevatan.strategyfactorypattern.controller.api;

import com.memrevatan.strategyfactorypattern.service.strategy.CardPaymentContext;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/payment")
public class PaymentController {

    private final CardPaymentContext cardPaymentContext;

    @PostMapping
    public ResponseEntity<Void> pay(@RequestParam("type") String type) {
        cardPaymentContext.executePayment(type);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
