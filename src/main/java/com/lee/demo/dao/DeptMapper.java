package com.lee.demo.dao;

import com.lee.demo.pojo.Dept;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * User: Lee
 * Date: 2018/10/29
 * Time: 11:22
 */
@Mapper
public interface DeptMapper {

    @Select("select * from m_dept")
    List<Dept> getDeptList();

    @Select("select * from m_dept where id = #{id}")
    Dept getDeptOne(@Param("id")Integer id);

    @Insert("insert into m_dept values (#{id},#{name},#{description})")
    int saveDept(Dept dept);

    @Delete("delete from m_dept where id = #{id}")
    int deleteDept(@Param("id")int id);

    @UpdateProvider(type =com.lee.demo.sql.DeptProvider.class ,method = "updateDeptSql")
    int updateDept(Dept dept);


}
