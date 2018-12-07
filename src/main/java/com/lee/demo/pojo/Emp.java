package com.lee.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA
 * User: Lee
 * Date: 2018/10/29
 * Time: 11:02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
/**
 * 员工表
 */
public class Emp {
    private Integer id;
    private String name;
    private String gender;
    private Integer age;
    private Dept dept;

    public Emp(Integer id,String name,String gender,Integer age){
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
