package cn.cstn.microservice.springcloud.service;

import cn.cstn.microservice.springcloud.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

    @Override
    public DeptClientService create(Throwable cause) {

        return new DeptClientService() {

            @Override
            public Dept get(long id) {

                Dept dept = new Dept();
                dept.setId(id);
                dept.setName("Customers提供降级信息，Provider已经关闭");

                return dept;
            }

            @Override
            public List<Dept> list() {

                return null;
            }

            @Override
            public boolean add(Dept dept) {

                return false;
            }

            @Override
            public String port() {

                return null;
            }

        };
    }

}
