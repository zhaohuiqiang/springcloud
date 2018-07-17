package cn.cstn.microservice.springcloud.service.impl;

import cn.cstn.microservice.springcloud.dao.DeptDao;
import cn.cstn.microservice.springcloud.entity.Dept;
import cn.cstn.microservice.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;


    @Override
    public boolean add(Dept dept) {

        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {

        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list() {

        return deptDao.findAll();
    }

}
