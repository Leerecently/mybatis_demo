package com.lee.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


/**
 * Created with IntelliJ IDEA
 * User: Lee
 * Date: 2018/10/29
 * Time: 11:08
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
/**
 * 组织表
 */
public class Dept {
    private Integer id;//组织ID
    private String name;//组织名称
    private String description;//组织概述
    private List<Emp> emps;//员工集合

    public Dept(Integer id,String name ,String description){
        this.id=id;
        this.name=name;
        this.description=description;
    }
}
