package com.cr.cloud.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Administrator
 * @version 1.0
 * @date 2020-10-05 21:30
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommonResult<T> {
    private Integer code;
    private String msg;
    private T data;

}
