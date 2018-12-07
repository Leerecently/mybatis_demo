package com.lee.demo.service.impl;

import com.lee.demo.dao.EmpMapper;
import com.lee.demo.dao.OneToMany;
import com.lee.demo.dao.OneToOne;
import com.lee.demo.pojo.Emp;
import com.lee.demo.service.EmpService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA
 * User: Lee
 * Date: 2018/10/29
 * Time: 11:06
 */
@Service
public class EmpServiceImpl implements EmpService {

    @Resource
    private EmpMapper empMapper;

    @Resource
    private OneToOne oneToOne;

    @Resource
    private OneToMany oneToMany;


    @Override
    public List<Emp> selectById(Integer id) {
        return oneToMany.selectById(id);
    }

    @Override
    public Emp getEmpOne(Integer id) {
        return oneToOne.getEmpOne(id);
    }

    @Override
    @Transactional
    public boolean updateEmp(Emp emp) {
        if(empMapper.updateEmp(emp)>0){
            System.out.println("修改成功");
            return true;
        }else{
            System.out.println("修改失败");
            return false;
        }
    }

    @Override
    public boolean deleteEmp(Emp emp) {
        if(empMapper.deleteEmp(emp)>0){
            System.out.println("删除成功");
            return true;
        }else{
            System.out.println("删除失败");
            return false;
        }
    }

    @Override
    @Transactional
    public boolean saveEmp(Emp emp) {
        try{
            if (true) {
                throw new RuntimeException("save 抛异常了");
            }
        }catch (Exception e){
            throw new RuntimeException();
        }
        if(empMapper.saveEmp(emp)>0){
            System.out.println("添加成功");
            return true;
        }else{
            System.out.println("添加失败");
            return false;
        }
    }




    @Override
    public List<Emp> getEmpList(Map<String, Object> map) {
        return empMapper.getEmpList(map);
    }
}
