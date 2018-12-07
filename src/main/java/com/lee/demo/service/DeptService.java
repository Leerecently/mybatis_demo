package com.lee.demo.service;

import com.lee.demo.pojo.Dept;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * User: Lee
 * Date: 2018/10/29
 * Time: 11:23
 */
public interface DeptService {
    List<Dept> getDeptList();
    Dept getDeptOne(Integer id);
    boolean saveDept(Dept dept);
    boolean deleteDept(int id);
    boolean updateDept(Dept dept);
    Dept selectDeptByIdToManyEmp(Integer id);
}
