package com.cr.cloud.service.impl;

import com.cr.cloud.dao.PaymentDao;
import com.cr.cloud.entities.Payment;
import com.cr.cloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Administrator
 * @version 1.0
 * @date 2020-09-16 22:10
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int save(Payment payment) {
        return paymentDao.save(payment);
    }

    @Override
    public Payment getPaymentById(Integer id) {
        return paymentDao.getPaymentById(id);
    }
}
