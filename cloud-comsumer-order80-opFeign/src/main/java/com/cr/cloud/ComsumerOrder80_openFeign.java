package com.cr.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Administrator
 * @version 1.0
 * @date 2020-09-24 23:01
 */
@SpringBootApplication
@EnableFeignClients
public class ComsumerOrder80_openFeign {
    public static void main(String[] args) {

        SpringApplication.run(ComsumerOrder80_openFeign.class,args);
    }
}
