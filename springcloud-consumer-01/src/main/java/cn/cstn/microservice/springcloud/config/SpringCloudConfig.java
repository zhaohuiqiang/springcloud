package cn.cstn.microservice.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class SpringCloudConfig {

    @Bean
    @LoadBalanced //客户端负载均衡工具
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
