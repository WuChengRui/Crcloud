package com.cr.cloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Administrator
 * @version 1.0
 * @date 2020-09-19 20:05
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    private Integer id;
    private String orderNo;
}
