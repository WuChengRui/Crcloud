package com.cr.cloud.controller;

import com.cr.cloud.entities.CommonResult;
import com.cr.cloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Set;

/**
 * @author Administrator
 * @version 1.0
 * @date 2020-09-17 23:08
 */
@RestController
public class CusPaymentController {

    @Autowired
    private RestTemplate template;
    private final String PROVIDER_URL= "http://localhost:8001/";
    @GetMapping("consumer/payment/get/{id}")
    public CommonResult<Payment> get(@PathVariable("id") Integer id){
        return template.getForObject(PROVIDER_URL+"payment/get/"+id,CommonResult.class);
    }

    @GetMapping("consumer/payment/save")
    public CommonResult<Payment> create(Payment payment){
        return template.postForObject(PROVIDER_URL+"payment/save",payment,CommonResult.class);
    }
}
