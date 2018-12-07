package com.lee.demo.service.impl;

import com.lee.demo.dao.DeptMapper;
import com.lee.demo.dao.OneToMany;
import com.lee.demo.pojo.Dept;
import com.lee.demo.service.DeptService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * User: Lee
 * Date: 2018/10/29
 * Time: 11:23
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Resource
    private DeptMapper deptMapper;

    @Resource
    private OneToMany oneToMany;
    @Override
    public List<Dept> getDeptList() {
        return deptMapper.getDeptList();
    }

    @Override
    @Transactional
    public boolean saveDept(Dept dept) {
        if (deptMapper.saveDept(dept)>0) {
            System.out.println("添加成功");
            return true;
        }else{
            System.out.println("添加失败");
            return false;
        }
    }

    @Override
    @Transactional
    public boolean updateDept(Dept dept) {
        if(deptMapper.updateDept(dept)>0){
            System.out.println("修改成功");
            return true;
        }else {
            System.out.println("修改失败");
            return false;
        }
    }

    @Override
    @Transactional
    public boolean deleteDept(int id) {
        if(deptMapper.deleteDept(id)>0){
            System.out.println("删除成功");
            return true;
        }else {
            System.out.println("删除失败");
            return false;
        }
    }

    @Override
    public Dept selectDeptByIdToManyEmp(Integer id) {
        return oneToMany.selectDeptByIdToManyEmp(id);
    }

    @Override
    public Dept getDeptOne(Integer id) {
        return deptMapper.getDeptOne(id);
    }
}
