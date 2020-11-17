package com.cr.cloud.controller;

import com.cr.cloud.entities.CommonResult;
import com.cr.cloud.entities.Payment;
import com.cr.cloud.service.impl.PaymentServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Administrator
 * @version 1.0
 * @date 2020-09-16 22:22
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentServiceImpl paymentService;

    Logger logger = LoggerFactory.getLogger(PaymentController.class);

    @PostMapping("/payment/save")
    public CommonResult<Payment> save(Payment payment){
        int save = paymentService.save(payment);
        if (save >0){
            logger.info("保存数据行数： "+save);
            return new CommonResult<Payment>(200,"保存成功",payment);
        }else{
            logger.info("保存数据行数： "+save);
            return new CommonResult<Payment>(300,"保存失败",payment);
        }
    }

    @RequestMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable Integer id){
        Payment payment = paymentService.getPaymentById(id);
        logger.info("查询： ");
        if (payment != null){
            return new CommonResult<Payment>(200,"操作成功",payment);
        }else{
            logger.info("无数据： ");
            return new CommonResult<Payment>(300,"操作失败",payment);
        }
    }
}
