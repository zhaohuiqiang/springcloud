package cn.cstn.microservice.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"cn.cstn.microservice.springcloud"})
public class SpringCloudConsumer02Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsumer02Application.class, args);
    }
}
