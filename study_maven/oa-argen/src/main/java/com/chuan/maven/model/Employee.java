package com.chuan.maven.model;

import lombok.Data;

/**
 * <p>
 *  员工类
 * </p>
 *
 * @author JingChuan
 * @since 2018/12/1 9:56
 */
@Data
public class Employee {
    /** id*/
    private int id;
    /** 姓名*/
    private String name;
    /** 年龄*/
    private int age;

}
