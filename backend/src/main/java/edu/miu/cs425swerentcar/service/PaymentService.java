package edu.miu.cs425swerentcar.service;

import edu.miu.cs425swerentcar.entity.Payment;

import java.util.List;

public interface PaymentService {
    List<Payment> getAllPayments();
    Payment makePayment(Payment payment);
    Payment viewPaymentById(Long paymentId);
}
