package com.cr.cloud.dao;

import com.cr.cloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Administrator
 * @version 1.0
 * @date 2020-09-16 22:07
 */
@Mapper
public interface PaymentDao {
    int save(Payment payment);
    Payment getPaymentById(@Param("id")Integer id);
}
