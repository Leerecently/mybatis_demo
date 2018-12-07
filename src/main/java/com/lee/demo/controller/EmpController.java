package com.lee.demo.controller;

import com.lee.demo.pojo.Emp;
import com.lee.demo.service.EmpService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA
 * User: Lee
 * Date: 2018/10/29
 * Time: 11:05
 */
@RequestMapping("emp")
@RestController
public class EmpController {

    @Resource
    private EmpService empService;

    @RequestMapping(value = "list")
    public List<Emp> getEmpList(){
        Map<String,Object> map = new HashMap<>();
        map.put("name","测试2号");
        List<Emp> list = empService.getEmpList(map);
        return list;
    }
    @RequestMapping(value = "save")
    public boolean saveEmp(){
        Emp emp = new Emp(20,"时光2","男",24);
        return empService.saveEmp(emp);
    }

    @RequestMapping(value = "delete")
    public boolean deleteEmp(){
        Emp emp = new Emp();
        emp.setName("测试5号");
//        emp.setAge(22);
//        emp.setGender("男");
        return empService.deleteEmp(emp);
    }

    @RequestMapping(value = "update")
    public boolean updateEmp(){
        Emp emp = new Emp();
        emp.setId(4);
        emp.setName("4号");
        return empService.updateEmp(emp);
    }
    @RequestMapping(value = "one")
    public Emp getOneEmp(){
        return empService.getEmpOne(3);
    }

    @RequestMapping(value = "many")
    public List<Emp> getonetomany(){
        return empService.selectById(3);
    }
}
