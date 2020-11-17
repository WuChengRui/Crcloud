package com.cr.cloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Administrator
 * @version 1.0
 * @date 2020-09-19 20:08
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String msg;
    private T      date;
    public CommonResult(Integer code,String msg){
        this(code,msg,null);
    }
}
