package com.cr.cloud.controller;

import com.cr.cloud.entities.CommonResult;
import com.cr.cloud.entities.Payment;
import com.cr.cloud.service.PaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Administrator
 * @version 1.0
 * @date 2020-09-24 23:10
 */
@RestController
public class PaymentControllerFeign {

    Logger logger = LoggerFactory.getLogger(PaymentControllerFeign.class);

    @Resource
    PaymentService paymentService;

    @PostMapping("feign/consumer/payment/save")
    public CommonResult<Payment> save(Payment payment){
        int save = paymentService.save(payment);

    }

    @GetMapping("feign/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable Integer id){
       return paymentService.getPaymentById(id);
    }
}
