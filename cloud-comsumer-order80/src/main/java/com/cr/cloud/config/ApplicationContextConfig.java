package com.cr.cloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Administrator
 * @version 1.0
 * @date 2020-09-17 23:37
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    public RestTemplate createRestTemplate(){
        return new RestTemplate();
    }
}
