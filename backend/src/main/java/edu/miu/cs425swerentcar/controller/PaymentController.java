package edu.miu.cs425swerentcar.controller;


import edu.miu.cs425swerentcar.entity.Payment;
import edu.miu.cs425swerentcar.service.PaymentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/car-rental/api/v1//payments")
public class PaymentController {

    private PaymentService paymentService;

    @Autowired

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping(value = "/list")
    public List<Payment> listPayments() {
        return paymentService.getAllPayments();
    }

    @GetMapping(value = "/get/{paymentId}")
    public Payment findPaymentById(@PathVariable Long paymentId) {
        return paymentService.viewPaymentById(paymentId);
    }

    @PostMapping(value = "/pay")
    public Payment makePayment(@Valid @RequestBody Payment payment) {
        return paymentService.makePayment(payment);
    }
}

