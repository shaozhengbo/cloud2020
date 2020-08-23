package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author shaozhengbo
 * @create 2020-08-16 10:51
 */
@Configuration
public class RestTemplateConfiguration {

    @Bean
    @LoadBalanced //使用LoadBalanced注解赋予RestTemplate负载均衡能力
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
