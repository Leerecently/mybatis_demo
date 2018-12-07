package com.lee.demo.dao;

import com.lee.demo.pojo.Dept;
import com.lee.demo.pojo.Emp;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * User: Lee
 * Date: 2018/10/29
 * Time: 17:08
 */
@Mapper
public interface OneToMany {
    @Select("select * from m_emp where id = #{id}")
    @Results({
            @Result(id=true,column="id",property="id"),
            @Result(column="name",property="name"),
            @Result(column="gender",property="gender"),
            @Result(column="age",property="age")
    })
    List<Emp> selectById(Integer id);

    @Select("select * from m_dept where id = #{id}")
    @Results({
            @Result(id=true,column="id", property="id"),
            @Result(column="name", property="name"),
            @Result(column="description", property="description"),
            @Result(column="id", property="emps",
                    many=@Many(
                            select="com.lee.demo.dao.OneToMany.selectById"
                    )
            )
    })
    Dept selectDeptByIdToManyEmp(Integer id);
}
