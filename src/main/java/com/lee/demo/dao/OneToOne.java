package com.lee.demo.dao;

import com.lee.demo.pojo.Emp;
import org.apache.ibatis.annotations.*;

/**
 * Created with IntelliJ IDEA
 * User: Lee
 * Date: 2018/10/29
 * Time: 17:08
 */
@Mapper
public interface OneToOne {
    /**
     * one to one
     * @param id
     * @return
     */
    @Select("select * from m_emp where id = #{id}")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "name",column = "name"),
            @Result(property = "age",column = "age"),
            @Result(property = "gender",column = "gender"),
            @Result(property = "dept",column = "dept_id",
                    one = @One(select = "com.lee.demo.dao.DeptMapper.getDeptOne"
                    )
            )
    })
    Emp getEmpOne(@Param("id") Integer id);
}
