package com.lee.demo.service;

import com.lee.demo.pojo.Emp;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA
 * User: Lee
 * Date: 2018/10/29
 * Time: 11:06
 */
public interface EmpService {
    List<Emp> getEmpList(Map<String,Object> map);
    boolean saveEmp(Emp emp);
    boolean deleteEmp(Emp emp);
    boolean updateEmp(Emp emp);
    Emp getEmpOne(Integer id);
    List<Emp> selectById(Integer id);
}
