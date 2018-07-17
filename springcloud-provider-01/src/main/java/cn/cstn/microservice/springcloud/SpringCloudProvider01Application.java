package cn.cstn.microservice.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudProvider01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProvider01Application.class, args);
    }
}
