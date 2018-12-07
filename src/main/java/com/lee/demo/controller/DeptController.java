package com.lee.demo.controller;

import com.lee.demo.pojo.Dept;
import com.lee.demo.service.DeptService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * User: Lee
 * Date: 2018/10/29
 * Time: 11:22
 */
@RequestMapping("dept")
@RestController
public class DeptController {

    @Resource
    private DeptService deptService;

    @RequestMapping(value = "list")
    public List<Dept> getDeptList(){
        List<Dept> list = deptService.getDeptList();
        return list;
    }

    @RequestMapping(value = "one")
    public Dept getDeptOne(){
        Dept dept = deptService.getDeptOne(1);
        return dept;
    }

    @RequestMapping(value = "save")
    public boolean saveDept(){
        Dept dept = new Dept(5,"产品部","产品");
        return deptService.saveDept(dept);
    }

    @RequestMapping(value = "delete")
    public boolean deleteDept(){
        return deptService.deleteDept(4);
    }

    @RequestMapping(value = "update")
    public boolean updateDept(){
        Dept dept = new Dept(4,"运算4部","运算");
        return deptService.updateDept(dept);
    }

    @RequestMapping(value = "onetomany")
    public Dept selectDeptByIdToManyEmp(){
        return deptService.selectDeptByIdToManyEmp(3);
    }
}
