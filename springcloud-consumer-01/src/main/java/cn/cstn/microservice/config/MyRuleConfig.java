package cn.cstn.microservice.config;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRuleConfig {
    //改变默认Ribbon轮询算法
    @Bean
    public IRule myRule() {
        //默认
        //return new RoundRobinRule();
        //return new RetryRule();
        //return new WeightedResponseTimeRule();
        return new MyRule();
    }
}
