package cn.cstn.microservice.springcloud;

import cn.cstn.microservice.config.MyRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "SPRINGCLOUD-PROVIDER", configuration = MyRuleConfig.class)
public class SpringCloudConsumer01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsumer01Application.class, args);
    }
}
