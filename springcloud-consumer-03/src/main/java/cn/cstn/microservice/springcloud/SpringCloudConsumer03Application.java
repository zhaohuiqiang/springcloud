package cn.cstn.microservice.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrixDashboard
public class SpringCloudConsumer03Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsumer03Application.class, args);
    }
}
