package com.cr.cloud.service;

import com.cr.cloud.entities.Payment;

public interface PaymentService {
    int save(Payment payment);
    Payment getPaymentById(Integer id);
}
