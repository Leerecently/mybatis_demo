package com.lee.demo.dao;

import com.lee.demo.pojo.Emp;
import org.apache.ibatis.annotations.*;
import java.util.List;
import java.util.Map;


/**
 * Created with IntelliJ IDEA
 * User: Lee
 * Date: 2018/10/29
 * Time: 11:04
 */
@Mapper
public interface EmpMapper {

    @SelectProvider(type = com.lee.demo.sql.EmpProvider.class,method = "selectProvider")

    List<Emp> getEmpList(Map<String,Object> map);

    @InsertProvider(type = com.lee.demo.sql.EmpProvider.class,method = "saveEmp")
    int saveEmp(Emp emp);

    @DeleteProvider(type = com.lee.demo.sql.EmpProvider.class,method = "deleteEmp")
    int deleteEmp(Emp emp);

    @UpdateProvider(type = com.lee.demo.sql.EmpProvider.class,method = "updateEmp")
    int updateEmp(Emp emp);
}
