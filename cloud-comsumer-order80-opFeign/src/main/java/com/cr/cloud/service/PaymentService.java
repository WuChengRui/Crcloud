package com.cr.cloud.service;

import com.cr.cloud.entities.CommonResult;
import com.cr.cloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Component
@FeignClient(name = "CLOUD-PAYMENT-SERVER")
public interface PaymentService {

    @PostMapping("/payment/save")
    int save(Payment payment);

    @GetMapping("/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Integer id);
}
