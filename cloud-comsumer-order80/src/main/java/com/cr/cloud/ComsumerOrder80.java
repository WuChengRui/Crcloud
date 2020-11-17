package com.cr.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Administrator
 * @version 1.0
 * @date 2020-09-17 23:02
 */

@SpringBootApplication
@EnableEurekaClient
public class ComsumerOrder80 {
    public static void main(String[] args) {

        SpringApplication.run(ComsumerOrder80.class,args);
    }
}
