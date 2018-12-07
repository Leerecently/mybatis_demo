package com.lee.demo.sql;

import com.lee.demo.pojo.Emp;
import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

/**
 * Created with IntelliJ IDEA
 * User: Lee
 * Date: 2018/10/29
 * Time: 15:14
 */
public class EmpProvider {
    //该方法会根据传递过来的map中的参数内容  动态构建sql语句
    public String selectProvider(Map<String,Object> map){
        return new SQL(){
            {
                SELECT("*");
                FROM("m_emp");
                if(map.get("id")!=null){
                    WHERE("id=#{id}");
                }
                if(map.get("name")!=null){
                    WHERE("name=#{name}");
                }
                if(map.get("gender")!=null){
                    WHERE("gender=#{gender}");
                }
                if(map.get("age")!=null){
                    WHERE("age=#{age}");
                }
                if(map.get("dept_id")!=null){
                    WHERE("dept_id=#{dept_id}");
                }
            }
        }.toString();
    }
    public String saveEmp(Emp emp){
        return new SQL(){
            {
                INSERT_INTO("m_emp");
                if(emp.getId()!=null){
                    VALUES("id","#{id}");
                }
                if(emp.getName()!=null){
                    VALUES("name","#{name}");
                }
                if(emp.getAge()!=null){
                    VALUES("age","#{age}");
                }
                if(emp.getGender()!=null){
                    VALUES("gender","#{gender}");
                }
            }
        }.toString();
    }
    public String deleteEmp(Emp emp){
        return new SQL(){
            {
                DELETE_FROM("m_emp");
                if(emp.getId()!=null){
                    WHERE("id=#{id}");
                }
                if(emp.getName()!=null){
                    WHERE("name=#{name}");
                }
                if(emp.getGender()!=null){
                    WHERE("gender=#{gender}");
                }
                if(emp.getAge()!=null){
                    WHERE("age=#{age}");
                }
            }
        }.toString();
    }

    public String updateEmp(Emp emp){
        return new SQL(){
            {
                UPDATE("m_emp");
                if(emp.getId()!=null){
                    SET("id=#{id}");
                }
                if(emp.getName()!=null){
                    SET("name=#{name}");
                }
                if(emp.getAge()!=null){
                    SET("age=#{age}");
                }
                if(emp.getGender()!=null){
                    SET("gender=#{gender}");
                }
                WHERE("id=#{id}");
            }
        }.toString();
    }
}
