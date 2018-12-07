package com.lee.demo.sql;

import com.lee.demo.pojo.Dept;
import org.apache.ibatis.jdbc.SQL;

/**
 * Created with IntelliJ IDEA
 * User: Lee
 * Date: 2018/10/29
 * Time: 14:56
 */
public class DeptProvider {

    public String updateDeptSql(Dept dept){
        return new SQL(){
            {
                UPDATE("m_dept");

                if(dept.getName() != null){
                    SET("name=#{name}");
                }
                if(dept.getDescription() != null){
                    SET("description=#{description}");
                }
                WHERE("id=#{id}");
            }
        }.toString();
    }
}
