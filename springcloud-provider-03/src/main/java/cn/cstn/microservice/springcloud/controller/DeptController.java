package cn.cstn.microservice.springcloud.controller;

import cn.cstn.microservice.springcloud.entity.Dept;
import cn.cstn.microservice.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String port;


    @RequestMapping(value = "dept/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept) {

        return deptService.add(dept);
    }

    @RequestMapping(value = "dept/get/{id}", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "processHystrix")
    public Dept get(@PathVariable Long id) {

        Dept dept = deptService.get(id);

        if (null == dept) {
            throw new RuntimeException("该ID：" + id + "没有没有对应的信息");
        }

        return deptService.get(id);
    }

    public Dept processHystrix(@PathVariable("id") Long id) {
        Dept dept = new Dept();
        dept.setId(id);
        dept.setName("熔断策咯");
        return dept;
    }

    @RequestMapping(value = "dept/list", method = RequestMethod.GET)
    public List<Dept> list() {

        return deptService.list();
    }

    @RequestMapping(value = "dept/port", method = RequestMethod.GET)
    public String port() {

        return port;
    }

    //服务端服务发现
    @RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
    public Object discovery() {
        List<String> list = discoveryClient.getServices();
        System.out.println("**********" + list);

        List<ServiceInstance> srvList = discoveryClient.getInstances("SPRINGCLOUD-PROVIDER");
        for (ServiceInstance element : srvList) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
                    + element.getUri());
        }
        return this.discoveryClient;
    }


}
