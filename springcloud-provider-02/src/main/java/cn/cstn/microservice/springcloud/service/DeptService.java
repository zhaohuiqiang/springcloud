package cn.cstn.microservice.springcloud.service;

import cn.cstn.microservice.springcloud.entity.Dept;

import java.util.List;


public interface DeptService {

    boolean add(Dept dept);

    Dept get(Long id);

    List<Dept> list();
}
